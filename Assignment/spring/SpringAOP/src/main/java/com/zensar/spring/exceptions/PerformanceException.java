package com.zensar.spring.exceptions;

public class PerformanceException extends Exception {
	
	private String errorMsg;
	
	public PerformanceException() {
		System.out.println("Performance is not good!");
	}

	public PerformanceException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
		System.out.println("Performance exception: " + errorMsg);
	}

	@Override
	public String toString() {
		return "PerformanceException [errorMsg=" + errorMsg + "]";
	}
	
}
