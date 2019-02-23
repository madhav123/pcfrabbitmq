package com.example.demo;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Service;


@Service
public class MessagePayload{
	Logger logger = LogManager.getLogger(MessagePayload.class);
	@RabbitListener(queues= {"Test"})
	public void handleMessage(Message message)  {
		// TODO Auto-generated method stub
		logger.info("message from mq" + message.toString());
	}
}
