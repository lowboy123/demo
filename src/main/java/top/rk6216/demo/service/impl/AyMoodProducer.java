package top.rk6216.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;


@Service
public class AyMoodProducer{
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	public void sendMessage(Destination destination, final String message){
		jmsMessagingTemplate.convertAndSend(destination,message);
}
}
