package com.idt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.idt.beans.TestBean;

@SpringBootApplication
public class AppStarter {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStarter.class, args);
		System.out.println("Application started, obtaining TestBean...");
		
		TestBean tb1=(TestBean)ctx.getBean("tb");
		TestBean tb2=(TestBean)ctx.getBean("tb");
		System.out.println(tb1==tb2);
	}

}
