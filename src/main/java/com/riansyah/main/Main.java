package com.riansyah.main;

import com.riansyah.javabasic.ExampleNullPointerException;

public class Main {

	public static void main(String[] args) {
		basicJava();
	}
	
	
	static void basicJava() {
		ExampleNullPointerException except = new ExampleNullPointerException();
		except.handlingException();
		except.withoutHandling();
		
	}
}
