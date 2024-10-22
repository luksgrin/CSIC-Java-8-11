package com.gmv.training.spring.zl.solution.jsf.hello;

import javax.annotation.ManagedBean;

import org.springframework.stereotype.Component;

@Component
@ManagedBean
public class HelloSolutionBean {

	private String name = "Pablo";
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("hola " + name);
	}
}
