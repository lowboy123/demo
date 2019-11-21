package top.rk6216.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	//hello world 测试 Controller层
	@RequestMapping("hi")
	@ResponseBody
	public String helloworld() {
		return "Hi~,this is springboot!";
	}
}
