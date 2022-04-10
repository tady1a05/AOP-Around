package com.toby.aop.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.toby.aop.model.Account;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println("Added the fucking account");
	}
	
	public void addAccount(Account acc) {
		System.out.println("Added the fucking account with object");
	}
	
	public ArrayList<Account> getAccountList(boolean bug) throws Exception {
		if(bug) {
			throw new Exception("nmsl");
		}
		ArrayList<Account> accountList = new ArrayList<>();
		
		accountList.add(new Account("1","NINGA Ting"));
		accountList.add(new Account("2","Peter Cheung"));
		
		return accountList;
	}
}
