package cc.sitec.web;

import cc.sitec.web.config.WebConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


/**
 *@author 凉水
 *@date 2020/5/28 10:35
 **/
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfig.class)
public abstract class BaseWebTest {
	protected MockMvc mockMvc;
	@Autowired
	protected WebApplicationContext webApplicationContext;

	@Before
	public void before() {
		DefaultMockMvcBuilder mockMvcBuilder = MockMvcBuilders.webAppContextSetup(webApplicationContext);
		this.mockMvc = mockMvcBuilder.alwaysExpect(MockMvcResultMatchers.status().isOk()).build();
	}
}
