package com.riansyah.ast.parser;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import com.beust.jcommander.Parameter;
import com.riansyah.ast.parser.InputTypeValidator.InputTypes;
import com.riansyah.ast.parser.inputParserStrategy.InputInterface;

public class Parameters {
	@Parameter(
	        names = {"-input-type"},
	        description = "The type of the input you prefer, default is manual. The possible values are: manual"
//	        validateWith = InputTypeValidator.class
	)
	private String inputType;
	@Parameter(
	        names = {"-source"},
	        description = "Source path",
	        variableArity = true
	)
	private List<String> sources = new ArrayList();
	
	
	
	public InputInterface getInputType() throws ParameterException {
		return InputTypes.getInputType(this.inputType);
	}
	public List<Path> getSources() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Path> getLibraries() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getJV() {
		// TODO Auto-generated method stub
		return null;
	}

}
