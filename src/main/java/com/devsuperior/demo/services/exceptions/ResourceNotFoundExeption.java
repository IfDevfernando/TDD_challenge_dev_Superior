package com.devsuperior.demo.services.exceptions;

public class ResourceNotFoundExeption extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExeption(String msg){
	        super(msg);
	    }

}
