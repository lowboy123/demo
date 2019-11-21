package top.rk6216.demo.service.impl;

import org.springframework.stereotype.Service;
import top.rk6216.demo.dao.AyMoodRepository;
import top.rk6216.demo.pojo.AyMood;
import top.rk6216.demo.service.IAyMoodService;

import javax.annotation.Resource;

@Service
public class AyMoodServiceImpl implements IAyMoodService {
	@Resource
	private AyMoodRepository ayMoodRepository;

	@Override
	public AyMood save(AyMood ayMood){
		return ayMoodRepository.save(ayMood);
}
}
