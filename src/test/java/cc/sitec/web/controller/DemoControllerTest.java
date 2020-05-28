package cc.sitec.web.controller;

import cc.sitec.web.BaseWebTest;
import cc.sitec.web.bean.User;
import cc.sitec.web.service.UserService;
import org.hamcrest.CoreMatchers;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// 按方法名顺序执行

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoControllerTest extends BaseWebTest {
	@MockBean
	private UserService userService;
	@Test
	public void test1() throws Exception {
		User user = new User();
		Integer userId = 2;
		user.setId(userId);
		Mockito.when(userService.findById(Mockito.anyInt())).thenReturn(user);
		mockMvc.perform(MockMvcRequestBuilders.get("/").param("id", userId.toString()))
				.andExpect(MockMvcResultMatchers.jsonPath("$.id", CoreMatchers.equalTo(userId)))
				.andDo(MockMvcResultHandlers.print());
	}
	@Test
	public void test2() throws Exception {
		User user = new User();
		Integer userId = 3;
		user.setId(userId);

		DemoController demoController = webApplicationContext.getBean(DemoController.class);
		UserService userService = Mockito.mock(UserService.class);
		ReflectionTestUtils.setField(demoController,"userService", userService);

		Mockito.when(userService.findById(Mockito.anyInt())).thenReturn(user);
		mockMvc.perform(MockMvcRequestBuilders.get("/").param("id", userId.toString()))
				.andExpect(MockMvcResultMatchers.jsonPath("$.id", CoreMatchers.equalTo(userId)))
				.andDo(MockMvcResultHandlers.print());
	}



}