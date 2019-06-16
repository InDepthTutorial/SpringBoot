package com.idt.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("tb")
public class TestBean {

	TestBean(){
		System.out.println("TestBean bean is created.");
	}
}
