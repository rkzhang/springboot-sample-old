package com.springboot.example;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.example.dao.UserDao;
import com.springboot.example.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = SpringbootApplication.class)
public class SpringbootSampleApplicationTests {

	@Autowired
	private UserDao userDao;
	
	@Test
	public void contextLoads() {
		User user = new User();
		//user.setId(111l);
		user.setMobile("18888888888");
		user.setPassword("111");
		user.setCreatedTime(new Date());
		user.setCreatedBy(111l);
		user.setDeleted(true);
		
		userDao.insert(user);
	}

}
