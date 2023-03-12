package Project.Parse.Node;


import Back_End.Project.Parse.Node.Node;

import java.util.*;

public class AssignmentStatementNode implements Node {
    protected VariableExpressionNode VariableExpressionNode;
    protected Node expressionNode;

    public AssignmentStatementNode(VariableExpressionNode VariableExpressionNode, Node expressionNode){
        this.VariableExpressionNode = this.VariableExpressionNode;
        this.expressionNode = expressionNode;
    }

    @Override
    public long evaluate(Map<String, Integer> bindings) {
        VariableExpressionNode.assignValue(expressionNode.evaluate(bindings));
        return 0;
    }

    @Override
    public void print(int height, Map<String, Integer> bindings) {
        for(int i = 0 ; i < height; ++i){
            System.out.print("   ");
        }
        System.out.print(" |---Assign ");
        VariableExpressionNode.print(0,bindings);
        System.out.print(" = ");
        expressionNode.print(0,bindings);
        System.out.println();
    }
}