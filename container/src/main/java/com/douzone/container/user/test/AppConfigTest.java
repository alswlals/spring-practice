package com.douzone.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig;
import com.douzone.container.user.Friend;
import com.douzone.container.user.User;

public class AppConfigTest {

	public static void main(String[] args) {
		testAppConfig();
	}

	private static void testAppConfig() {
		/* 자바 설정을 annotation으로 해주고 그 기반으로 자바코드 진행*/
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ac.getBean(User.class);
		System.out.println(user);
		
		Friend friend = ac.getBean(Friend.class);
		System.out.println(friend);
	}

}
