package com.nt.niranjana.springboot.datajpa.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException()
	{
		super();
	}

	public ResourceNotFoundException(String message)
	{
		super(message);
	}

}
