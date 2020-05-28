package cc.sitec.web;


import cc.sitec.web.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *@author 凉水
 *@date 2020/5/27 17:53
 **/
public class WebApplication  {
	public static void main(String[] args) {
		SpringApplication.run(WebConfig.class, args);
	}
}
