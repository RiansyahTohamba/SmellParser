package com.riansyah.ast.learn;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.dom.ASTParser;
//import org.eclipse.jdt.internal.compiler.ast.LambdaExpression.analyseCode;
import org.eclipse.jdt.internal.compiler.ast.LambdaExpression;
import com.riansyah.ast.parser.ASTParserManager;
import com.riansyah.ast.parser.FileVisitHelper;

public class BasicAST {
	private ASTParser jdtParser;
	private List<Path> filesPath;
	
	ASTParserManager.ASTRequestor parRequest = (ASTParserManager.ASTRequestor) null;
	ASTParserManager.ASTRequestor req = new ASTParserManager.ASTRequestor(parRequest);
	String[] visitPath = FileVisitHelper.toArrayString(this.filesPath);
	String[] par2 = (String[])null;
	String[] par3 = new String[0];
	IProgressMonitor par5 = (IProgressMonitor)null;
	
	public void oriCreateAST() {
//		error tidak terjadi di req?
		
//		total 5 paramater
		this.jdtParser.createASTs(visitPath, par2, par3, req, par5);
	}
	
	
	public void visitPathIsNull() {
		visitPath = null;
		this.jdtParser.createASTs(visitPath, par2, par3, req, par5);	
//		apa pesan yang keluar?		
		/*
Exception in thread "main" java.lang.NullPointerException
	at com.riansyah.ast.parser.FileVisitHelper.toArrayString(FileVisitHelper.java:11)
	at com.riansyah.ast.learn.BasicAST.<init>(BasicAST.java:18)
	at com.riansyah.main.Main.main(Main.java:15)

jika visitPath = null maka NPE akan muncul di method FileVisitHelper.toArrayString
faktanya, error malah dalam dan muncul hingga ke layer sekian
	at org.eclipse.jdt.internal.compiler.ast.LambdaExpression.analyseCode(LambdaExpression.java:469)
next question, apakah logic dari LambdaExpression.analyseCode?
harus open dulu?
 
open  eclipse-ast-lambda-expression.txt
		 */


	}
}
