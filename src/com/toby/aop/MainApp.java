package com.toby.aop;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.toby.aop.dao.*;
import com.toby.aop.model.Account;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		FortuneDao fortuneDao = context.getBean("fortuneDao",FortuneDao.class);
		
		String text = null;
		
		try {
			text = fortuneDao.getMoney(true);
			System.out.println(text);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finish");
		context.close();
	}

}
