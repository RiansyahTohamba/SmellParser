class LambdaExpression{

	public FlowInfo analyseCode(BlockScope currentScope, FlowContext flowContext, FlowInfo flowInfo){
		if (this.ignoreFurtherInvestigation) {
            return flowInfo;
        } else {
            FlowInfo lambdaInfo = flowInfo.copy();
            ExceptionHandlingFlowContext methodContext = new ExceptionHandlingFlowContext(flowContext, this, this.binding.thrownExceptions, (FlowContext)null, this.scope, FlowInfo.DEAD_END);
            MethodBinding methodWithParameterDeclaration = this.argumentsTypeElided() ? this.descriptor : this.binding;
            AbstractMethodDeclaration.analyseArguments18(lambdaInfo, this.arguments, methodWithParameterDeclaration);
            if (this.arguments != null) {
                int i = 0;

                for(int count = this.arguments.length; i < count; ++i) {
                    this.bits |= this.arguments[i].bits & 1048576;
                }
            }

            lambdaInfo = this.body.analyseCode(this.scope, methodContext, lambdaInfo);
            if (this.body instanceof Block) {
                TypeBinding returnTypeBinding = this.expectedResultType();
                if (returnTypeBinding == TypeBinding.VOID) {
                    if ((lambdaInfo.tagBits & 1) == 0 || ((Block)this.body).statements == null) {
                        this.bits |= 64;
                    }
                } else if (lambdaInfo != FlowInfo.DEAD_END) {
                    this.scope.problemReporter().shouldReturn(returnTypeBinding, this);
                }
            } else if (currentScope.compilerOptions().isAnnotationBasedNullAnalysisEnabled && lambdaInfo.reachMode() == 0) {
                Expression expression = (Expression)this.body;
                this.checkAgainstNullAnnotation(flowContext, expression, expression.nullStatus(lambdaInfo, flowContext));
            }

            return flowInfo;
        }
	}
	
}