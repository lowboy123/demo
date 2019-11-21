package top.rk6216.demo.service.impl;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import top.rk6216.demo.pojo.AyMood;
import top.rk6216.demo.service.IAyMoodService;

import javax.annotation.Resource;

@Component
public class AyMoodConsumer{

	@JmsListener(destination = "ay.queue")
	public void receiveQueue(String text){
		System.out.println("用户发表说说【"+text+"】成功");
}
	@Resource
	private IAyMoodService ayMoodService;
	@JmsListener(destination = "ay.queue.asyn.save")
	public void receiveQueue(AyMood ayMood){
		ayMoodService.save(ayMood);
	}

}
