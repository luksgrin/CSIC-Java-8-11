package com.gmv.training.spring.ai.example.aspects;

import org.springframework.stereotype.Service;

@Service
public class AspectsServiceImpl implements AspectsService{

	/**
	 * (non-javadoc)
	 * 
	 * @see AspectsService#printHolaMundoWithoutAspect()
	 */
	@Override
	public String printHolaMundoWithoutAspect() {
		System.out.println("Ejecutando metodo String printHolaMundoWithoutAspect()");
		return "Hola Mundo!";
	}

	/**
	 * (non-javadoc)
	 * 
	 * @see AspectsService#printHolaMundoWithAspect()
	 */
	@Override
	@LogMethodAnnotation
	public String printHolaMundoWithAspect() {
		return "Hola Mundo!";
	}
}
