package com.nt.niranjana.springboot.datajpa.exception;

public class CustomInsertException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomInsertException(String message)
	{
		super(message);
	}

}
