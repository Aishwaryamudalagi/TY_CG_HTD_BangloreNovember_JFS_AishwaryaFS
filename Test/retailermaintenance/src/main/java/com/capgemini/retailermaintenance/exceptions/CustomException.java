package com.capgemini.retailermaintenance.exceptions;

public class CustomException extends RuntimeException{
String msg;
	
	public CustomException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
