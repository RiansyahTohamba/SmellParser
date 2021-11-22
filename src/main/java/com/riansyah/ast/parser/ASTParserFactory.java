package com.riansyah.ast.parser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ASTParserFactory {
	
	private final List<Path> classPath;
    private final List<Path> filesPath;
    private final List<Path> sourcePath;
    
    private ASTParserFactory(ASTParserFactory.Builder builder) throws IOException {
		this.filesPath = null;
		this.classPath = null;
		this.sourcePath = null;
//        this.bootClassPath = builder.bootClassPath;
//        this.version = builder.version;
//        this.encoding = builder.encoding;
//        this.classPath = builder.classPath;
//        if (builder.filesPath == null) {
//            throw new IOException("No file path insert");
//        } else {
//            this.filesPath = builder.filesPath;
//            this.sourcePath = builder.sourcePath;
//        }
    }
    
//    public ASTParserFactory(Builder builder, ASTParserFactory astParserFactory) {
//		this.sourcePath = null;
//		// TODO Auto-generated constructor stub
//	}
//    
	public class Builder {

		
		public ASTParserFactory build() throws IOException {
			return null;
//	        if (this.packagePath != null) {
//	            this.filesPath = FileVisitHelper.collectJavaFiles(this.packagePath);
//	        }
//
//	        if (this.rootPath != null) {
//	            this.filesPath = FileVisitHelper.collectJavaFiles(this.rootPath);
//	        }

//	        return new ASTParserFactory(this, (ASTParserFactory)null);
	    }
	}

}
