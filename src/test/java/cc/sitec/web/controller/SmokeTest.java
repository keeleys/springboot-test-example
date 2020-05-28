package cc.sitec.web.controller;

import cc.sitec.web.BaseWebTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *@author 凉水
 *@date 2020/5/28 10:54
 **/
public class SmokeTest extends BaseWebTest {

	@Autowired
	private DemoController controller;

	@Test
	public void contextLoadsTest() throws Exception {
		assertThat(controller).isNotNull();
	}
}