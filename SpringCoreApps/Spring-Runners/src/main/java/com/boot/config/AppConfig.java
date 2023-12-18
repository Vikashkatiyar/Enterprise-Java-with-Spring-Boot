package com.boot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boot.methodRef.SampleTest;

@Configuration
public class AppConfig {

	@Bean
	public CommandLineRunner runA() {
		return SampleTest::test;
	}
}
