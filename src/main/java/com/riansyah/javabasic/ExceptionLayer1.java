package com.riansyah.javabasic;

public class ExceptionLayer1 {
	public String strLayer1() {
		return new ExceptionLayer2().strLayer2(); 
	}
	
	public int getLength(String name) {		
		return name.length(); 
	}
	
	public String nullLayer2() {
		return new ExceptionLayer2().nullLayer2(); 
	}
	
}
