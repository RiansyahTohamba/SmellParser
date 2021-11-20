package com.riansyah.javabasic;

public class ExampleNullPointerException {
/*
 * jika exception tidak dihandling maka program akan berhenti pada line tersebut	
 */
	public void withoutHandling() {
		System.out.println("start execution");
//		NullPointer code
		String a = null;
		System.out.println(a);
		System.out.println(a.length());
		System.out.println("this line will be failed to be executed");
	}
	
	/*
	 * jika dihandling maka proses tetap berjalan hingga loc habis
	 */
	public void handlingException() {
		System.out.println("start eksekusi");
		try {
			String a = null;
			System.out.println(a);
			System.out.println(a.length());
		}catch(Exception e) {
			System.err.println(e);
		}
		System.out.println("this line still to be executed");
		System.out.println("even though there still error");
	}
}
