package com.petl.library;

public class ProcNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	
	String msg;
	
	ProcNotFoundException(String msg) {
		this.msg = msg;
	}
	
	public String toString(){ 
		return (msg) ;
	   }

}
