package com.riansyah.ast.parser.inputParserStrategy;

import java.util.List;
import java.io.IOException;
import java.nio.file.Path;

import com.riansyah.ast.parser.ASTParserManager;
import com.riansyah.ast.parser.Parameters;
import com.riansyah.ast.parser.ASTParserFactory.Builder;;

public class InputManual implements InputInterface{
    
	public ASTParserManager createParserManager(Parameters params) throws IOException {
        List<Path> sourcePath = params.getSources();
        List<Path> libPaths = params.getLibraries();
        Builder build;
//        if (params.getJV() != null) {
//            build = new Builder(params.getConfig());
//            build.setCodeVersion(params.getJV());
//        } else {
//            build = new Builder();
//        }
//
//        build.setEncoding(params.getEncoding());
//        build.setFilesPath(params.getFilesPaths());
//        build.setSourcePath(sourcePath);
//        if (libPaths != null) {
//            build.setClassPath(libPaths);
//        }

//     todo: nah disini bermasalah
//        ASTParserManager parser = build.build().parserBuild();
//        parser.parse();

        
//        return parser;
      return null;        
    }
	
	public ASTParserManager parserBuild() throws IOException {
		return null;
//        return new ASTParserManager(this.classPath, this.sourcePath, this.filesPath, this.version, this.bootClassPath, this.encoding);
    }
}
