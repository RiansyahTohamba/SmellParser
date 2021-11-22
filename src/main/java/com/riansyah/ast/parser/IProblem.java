package com.riansyah.ast.parser;

public interface IProblem {

	String getMessage();

	String getSourceLineNumber();

	char[] getOriginatingFileName();

}
