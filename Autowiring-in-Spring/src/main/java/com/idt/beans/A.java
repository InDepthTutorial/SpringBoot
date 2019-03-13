package com.idt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	private B b;

	public void setB(B b) {
		this.b = b;
		System.out.println("Setter is invoked.");
	}
	A(){
		System.out.println("A bean is created.");
	}

	@Autowired
	public A(B b) {
		this.b = b;
		System.out.println("A bean is created, param cons called.");
	}
	
}
