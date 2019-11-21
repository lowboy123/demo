package top.rk6216.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import top.rk6216.demo.pojo.AyMood;

import javax.jms.Destination;


@Service
public class AyMoodProducer{
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	public void sendMessage(Destination destination, final String message){
		jmsMessagingTemplate.convertAndSend(destination,message);
	}
	public void sendMessage(Destination destination,final AyMood ayMood){
		jmsMessagingTemplate.convertAndSend(destination,ayMood);
	}

}
