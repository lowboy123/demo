package top.rk6216.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ay_mood")
public class AyMood implements Serializable {
	//主键
	@Id
	private String id;
	//说说内容
	private String content;
	//用户id
	private String userId;
	//点赞数量
	private Integer praiseNum;
	//发表时间
	private Date publishTime;
	//get set 方法
}
