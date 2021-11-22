package com.riansyah.ast.learn;

import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.ast.Expression;
import org.eclipse.jdt.internal.compiler.ast.LambdaExpression;
import org.eclipse.jdt.internal.compiler.ast.Statement;
import org.eclipse.jdt.internal.compiler.env.ICompilationUnit;
import org.eclipse.jdt.internal.compiler.flow.FlowContext;
import org.eclipse.jdt.internal.compiler.flow.FlowInfo;
import org.eclipse.jdt.internal.compiler.lookup.BlockScope;

public class LambdaExpressionTest {
    public Statement body;

    void testLambda(){
        char[] fileName;
        ICompilationUnit compilationUnit;
        int unitIndex;
        int totalUnitsKnown;
        int maxProblemPerUnit;
        BlockScope currentScope;
        FlowContext flowContext;
        FlowInfo flowInfo;

//        constructor mana yang dipakai ?
//        CompilationResult crV1 = new CompilationResult(fileName);
        CompilationResult crV2 = new CompilationResult(compilationUnit,unitIndex,totalUnitsKnown,maxProblemPerUnit);

        boolean assistNode = true;

        (org.eclipse.jdt.internal.compiler.CompilationResult, boolean)
        LambdaExpression le = new LambdaExpression(crV2,assistNode);


        le.analyseCode(currentScope,flowContext,flowInfo);
//        nah  kenapa analyseCode muncul NPE?
    }




    void snippetAnalyseCode(){
/*
karena melibatkan (this) alias (object hasil instansi LambdaExpression)
maka kita harus buat object LambdaExpression dahulu
 */

        Expression expression = (Expression) this.body;
        // disini NPE nya muncul !
        // line 469 =  this.checkAgainstNullAnnotation...
//        this.checkAgainstNullAnnotation(flowContext, expression, expression.nullStatus(lambdaInfo, flowContext));

/*
Programmer tanpa pengetahuan AST Parser 😱

Masih banyak yang harus diketahui jika ingin mengetahui cara kerja dari org.eclipse.jdt.core
WOW! kepala mengepul!
seharusnya pas S1, kuliah AST Parser harus dilulusi dulu baru bisa ke tahap selanjutnya.
nah praktikum Lab dari konsep AST Parser adalah mengulik AST parser milik org.eclipse.jdt.core.
ibarat mahasiswa civil engineering tapi ga menguasai material science (aspal, semen,pasir, etc)
ibarat mahasiswa teknik pangan tapi tidak memahami reaksi kimia (oksidasi etc) dll

*/

    }
}
