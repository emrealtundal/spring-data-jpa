package com.emrealtundal.starter;

import com.emrealtundal.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.emrealtundal")
@ComponentScan(basePackages = "com.emrealtundal")
@EnableJpaRepositories(basePackages = "com.emrealtundal")
@EnableConfigurationProperties(value = GlobalProperties.class)
//@PropertySource(value = "classpath:application.properties")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
