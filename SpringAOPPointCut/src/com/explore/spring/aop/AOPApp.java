package com.explore.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.dao.AccountDAO;
import com.explore.spring.aop.dao.MembershipDAO;

public class AOPApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = ctxt.getBean( "accountDAO",AccountDAO.class);
		
		Account account = new Account();
		
		accountDAO.addAccount(account,true);
		
		accountDAO.removeAccount(account);
		
		
		MembershipDAO membershipDAO = ctxt.getBean( "membershipDAO",MembershipDAO.class);
		membershipDAO.addAccount();
		
		membershipDAO.removeAccount();
		
		ctxt.close();


	}

}
