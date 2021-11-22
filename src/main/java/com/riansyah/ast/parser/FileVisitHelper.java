package com.riansyah.ast.parser;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class FileVisitHelper {
	private FileVisitHelper() {
    }
	public static String[] toArrayString(List<Path> listPath) {
        String[] arrayString = new String[listPath.size()];
        int i = 0;

        for(Iterator var4 = listPath.iterator(); var4.hasNext(); ++i) {
            Path entry = (Path)var4.next();
            arrayString[i] = entry.toString();
        }

        return arrayString;
    }

}
