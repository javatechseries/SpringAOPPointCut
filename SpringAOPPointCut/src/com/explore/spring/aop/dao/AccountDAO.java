package com.explore.spring.aop.dao;

import org.springframework.stereotype.Component;

import com.explore.spring.aop.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass()+" : Adding an account \n");
	}
	
	public void removeAccount(Account account) {
		System.out.println(getClass()+" : Removing an account \n");
	}

}
