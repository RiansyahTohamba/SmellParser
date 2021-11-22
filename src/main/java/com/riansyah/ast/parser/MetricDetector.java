package com.riansyah.ast.parser;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/*
 * properti apa yang bernilai null?
 *  
 * 
1. MetricDetector.compute() -> 
	jika sukses berarti masuk ke kelas InputManual?
	mana kodenya?
	
2. InputManual.createParserManager() ->
 	bagaimana cara InputManual.createParserManager() ke ASTParserManager.parse() ?
 	open InputManual.createParserManager
 	langsung cari method .parse	 
 	
3. ASTParserManager.parse() -> 
	tapi sudah masuk .parse()

4. eclipse.jdt.core.dom.ASTParser.createASTs
	?
*/

public class MetricDetector {
	private static final Parameters params = new Parameters();
//	params didapatkan dari mana?
	public void compute() throws IOException, ParserOrCompilerErrorException, ParameterException{
		System.out.println();
		System.out.println("Starting analysis...");
		
//		getInputType itu tipenya adalah InputManual 
        ASTParserManager parser = params.getInputType().createParserManager(params);
        
/*
    todo: params.getInputType() = null?        
    nah pas Parser ini sudah error
	tidak ada handling exception disini	
*/      
        
        
        
        
//        belum masuk ke method ini
        HashMap<String, IProblem> errors = parser.getErrors();
        if (errors.isEmpty()) {
//        	success dalam eksekusi
//            ModelHandler model = new ModelHandler(parser, params.getAnalysis());
//            model.computeAll(1, params.getThreadsNumber());
//            Project project = model.getProject();
//            it.unimib.disco.essere.sandbox.model.Project mine = this.fillProject(project, this.detectSmells(project));
//            String outputFile = params.getOutput();
//            OutputInterface outputStrategy = params.getOutputType();
//            System.out.println("Type of chosen output: {}", outputStrategy.outputType());
//
//            try {
//                System.out.println("Saving analysis model to element: {}", outputFile);
//                outputStrategy.publish(outputFile, mine);
//            } catch (Exception var9) {
//                var9.printStackTrace();
//            }
//
//            model.deleteModel(true);
//            ModelDataHolder.disposeModelDataHolder();
            System.out.println("Analysis finished");
        } else {
        	System.out.println("There are some parsing errors:");
            Iterator var4 = errors.values().iterator();

            while(var4.hasNext()) {
                IProblem entry = (IProblem)var4.next();
                System.out.println(entry.getMessage() + " - in file: " + String.copyValueOf(entry.getOriginatingFileName()) + " - at line: " + entry.getSourceLineNumber());
            }

            System.out.println("The analysis will be aborted");
            throw new ParserOrCompilerErrorException("There are some parsing errors");
        }
	}
}
