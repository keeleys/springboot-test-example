package cc.sitec.web.config;

import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *@author 凉水
 *@date 2020/5/27 17:55
 **/
@Configuration
@CustomerAutoConfiguration({
		// 加载内置web容器的factory。TomcatServletWebServerFactory
		ServletWebServerFactoryAutoConfiguration.class,
		DispatcherServletAutoConfiguration.class,
		// 设置 CharacterEncodingFilter
		HttpEncodingAutoConfiguration.class,
})
@ComponentScan("cc.sitec.web")
@EnableWebMvc
public class WebConfig {

}
