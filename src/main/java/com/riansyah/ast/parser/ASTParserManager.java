package com.riansyah.ast.parser;

import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FileASTRequestor;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ASTParserManager {
	private ASTParser jdtParser;
	private Map<Path, CompilationUnit> ASTs;
	private List<Path> filesPath;
	
	public HashMap<String, IProblem> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ASTParserManager(List<Path> classPaths, List<Path> sourcePath, List<Path> files, CodeVersion javaVersion, Path externalBootClassPath, String encoding) throws IOException {
		this.jdtParser = ASTParser.newParser(4);
	}	
	
//	tipenya apa?
	public Map<Path, CompilationUnit> parse() {
//        ASTParserManager.ASTRequestor req = new ASTParserManager.ASTRequestor((ASTParserManager.ASTRequestor) null);

        try {
//            this.jdtParser.createASTs(FileVisitHelper.toArrayString(this.filesPath), (String[])null, new String[0], req, (IProgressMonitor)null);
        } catch (IllegalStateException var3) {
            System.out.println(var3.getClass() + " ERROR: " + var3.getMessage());
// example printlin
// [MetricDetector][ERROR]: DefaultI18nContext cannot be resolved - in file: /media/riansyah/Windows-SSD/Users/LENOVO/projects/project-investigated/pdfsam/pdfsam-core/src/main/java/org/pdfsam/support/io/ObjectCollectionWriter.java - at line: 66
// IllegalStateException berisikan class apa yang error, yaitu 'MetricDetector' 
//            
            var3.printStackTrace();
        }

        return this.getASTs();
    }

    public Map<Path, CompilationUnit> getASTs() {
        return this.ASTs;
    }
    
	public static class ASTRequestor extends FileASTRequestor {
        ASTRequestor() {
        }
        
        public ASTRequestor(ASTParserManager var1) {
//        	this.this$0 = var1;
        }
        
        public ASTRequestor(ASTRequestor belumTau) {
        	/*
        	 * kode client dari constructor ASTRequestor() sebagai berikut:
        	 * (ASTParserManager.ASTRequestor) null
        	 * 
        	 * karena paramater pada constructor ASTRequestor di CAST dengan tipe ASTRequestor
        	 *  maka tipe parameternya bukan ASTParserManager
        	 *  
        	 *  Padahal pada kode hasil dekompilasi ASTParserManager.class disebutkan bahwa paramater dari ASTRequestor adalah ASTParserManager var1
        	 *  ditambah dengan syntax this.this$0 = var1;
        	 *  makin bingunglah aku   
        	 */
        }
                
	}
}
