package com.boot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRunnersApplication {

	public static void main(String[] args) {
		
		SpringApplication application=new SpringApplication();
		application.setBannerMode(Mode.CONSOLE);
		
		ConfigurableApplicationContext ctx=application.run(SpringRunnersApplication.class, args);
		ctx.close();
	}

}
