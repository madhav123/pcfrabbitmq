package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableRabbit
public class PfcrabbitmqexApplication {
	


	public static void main(String[] args) {
		
		
		SpringApplication.run(PfcrabbitmqexApplication.class, args);
	}

	@Bean
	@Qualifier("Test")
	public Queue createque() {		
		return new Queue("Test");
		
	}
	
}
