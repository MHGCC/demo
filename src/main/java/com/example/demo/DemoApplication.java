package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Exclude Hibernate and DataSource auto-configuration
// This is useful when you want to use a different persistence mechanism or no persistence at all.
@SpringBootApplication(exclude = {
    org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class,
    org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class
},
		// Specify the base package to scan for components
scanBasePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
