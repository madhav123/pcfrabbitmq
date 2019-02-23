package com.example.demo;

import java.util.Date;
import java.util.Iterator;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageRestController {
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

		@RequestMapping("/putdatatomq")
		String putmessageinQueue() {
			rabbitTemplate.convertAndSend("Test", "Sample Test");
			return "success";
		}
		
		
}
