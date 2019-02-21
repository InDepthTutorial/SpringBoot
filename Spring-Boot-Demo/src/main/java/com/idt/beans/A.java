package com.idt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	private B b;
	A(){
		System.out.println("A bean is created.");
	}
}
