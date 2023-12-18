package com.boot.config.customer;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class Db1Config {
   
	//Datasource
	@Bean
	@ConfigurationProperties(prefix="db1.datasource")
	public DataSource db1DataSource() {
		return DataSourceBuilder.create().build();
	}
	
	//EntityManagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean db1EntityManagerFactory() {
		
	}
	
	//TransactionManagement
}
