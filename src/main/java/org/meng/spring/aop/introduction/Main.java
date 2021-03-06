package org.meng.spring.aop.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop/aop-introduction.xml");
		AccountService accountService = (AccountService) applicationContext.getBean("accountService");
		System.out.println(accountService.getBalance("622021234567"));
		accountService.transfer("1234", "abcd", 11);

	}

}
