package com.gmv.training.spring.crud.repository.impl;

public class BooksRepositoryImpl {
	
	private BooksRepositoryImpl repository;
	
	public BooksRepositoryImpl() {
		  if (repository == null) {
			  repository = new BooksRepositoryImpl(); 
		  }
	}
	
	public String getName() {
		return "hola";
	}
}
