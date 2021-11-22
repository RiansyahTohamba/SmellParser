package com.riansyah.main;

import java.io.IOException;

import com.riansyah.ast.learn.BasicAST;
import com.riansyah.ast.parser.MetricDetector;
import com.riansyah.ast.parser.ParserOrCompilerErrorException;
import com.riansyah.javabasic.ExampleNullPointerException;
import com.riansyah.javabasic.ExceptionLayer1;

public class Main {
	ExceptionLayer1 el1 = new ExceptionLayer1();
	
	public static void main(String[] args) {
		new BasicAST().visitPathIsNull();
//		new BasicAST().createASTs();
		
		
		
//		diffHandling();		
//		new Main().diffLocationLength();
//		new Main().diffLayerOfNull();
	}
	
	private void diffLocationLength() {
		System.out.println(el1.getLength("Riansyah"));
		System.out.println(el1.getLength(null));				
	}
	
	private void diffLayerOfNull() {
//		nullLayer2()
		new ExceptionLayer1().nullLayer2().length();
		
//		at com.riansyah.main.Main.main(Main.java:12)
//		nullLayer1()
		
//		at com.riansyah.main.Main.main(Main.java:16)
		
		/*
		 * sama saja, error terjadi di Main.main
		 * 		jika dilayer 2, error nya dimana?		
				new ExceptionLayer1().nullLayer2().length();
				at com.riansyah.main.Main.main(Main.java:12)
				
				jika dilayer 1, error nya dimana?		
				new ExceptionLayer1().nullLayer1().length();
				at com.riansyah.main.Main.main(Main.java:16)
		 */		
	}
	
	public static void execute(String[] args) throws IOException, ParserOrCompilerErrorException {
		MetricDetector sandbox = new MetricDetector();
//        sandbox.compute();
		/*
        JCommander command = new JCommander(params, args);
        if (args.length != 0 && !params.isHelp()) {
            MetricDetector sandbox = new MetricDetector();
            sandbox.compute();
        } else {
            command.usage();
        }
        */

    }
	static void diffHandling() {
		ExampleNullPointerException except = new ExampleNullPointerException();
		except.handlingException();
		except.withoutHandling();
		
	}
}
