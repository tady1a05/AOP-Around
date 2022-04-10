package com.toby.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {
	public void addAccount() {
		System.out.println("add Account");
	}
}
