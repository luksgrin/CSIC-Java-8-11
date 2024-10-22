package com.gmv.training.spring.ai.example.aspects;


public interface AspectsService {
	
	/**
	 * print "Hola Mundo" without aspect
	 * 
	 * @return {@link String}
	 */
	String printHolaMundoWithoutAspect();
	
	/**
	 * print "Hola Mundo" with aspect
	 * 
	 * @return {@link String}
	 */
	String printHolaMundoWithAspect();

}
