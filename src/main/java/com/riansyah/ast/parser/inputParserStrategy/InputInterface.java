package com.riansyah.ast.parser.inputParserStrategy;

import java.io.IOException;
import java.net.MalformedURLException;

import com.riansyah.ast.parser.ASTParserManager;
import com.riansyah.ast.parser.Parameters;

public interface InputInterface {

	ASTParserManager createParserManager(Parameters var1) throws MalformedURLException, IOException;

}
