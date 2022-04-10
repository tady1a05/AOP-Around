package com.toby.aop.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class FortuneDao {
	public String getMoney(boolean bug) throws Exception {
		if(bug) {
			throw new Exception("NMSL");
		}
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "Hello";
	}
}
