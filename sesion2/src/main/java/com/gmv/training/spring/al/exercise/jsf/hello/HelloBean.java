package com.gmv.training.spring.al.exercise.jsf.hello;


import org.springframework.stereotype.Component;

@Component
public class HelloBean {

	/**
	 *  Anadir implementacion:
	 *  	- anadir propiedad name con su getter y setter
	 *  	- sustituir en sayHello desconocido por la propiedad name 
	 */
	public void sayHello() {
		System.out.println("hola desconocido");
	}
}
