package com.wxh.test;

import com.wxh.config.SpringConfig;
import com.wxh.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		User user = context.getBean(User.class);
	}
}
