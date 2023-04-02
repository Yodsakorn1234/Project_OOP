package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public abstract class ConditionStatementNode {
    protected Node.ExpressionNode conditionNode;
    protected Node.ExecuteNode trueStatement;
    protected Node.ExecuteNode falseStatement;

    public ConditionStatementNode(Node.ExpressionNode conditionNode, Node.ExecuteNode trueStatement, Node.ExecuteNode falseStatement){
        this.conditionNode = conditionNode;
        this.trueStatement = trueStatement;
        this.falseStatement = falseStatement;
    }

    @Override
    public boolean execute(Game bindings) {
        trueStatement.next = next;
        falseStatement.next = next;

        if(conditionNode.evaluate(bindings) > 0){
            return trueStatement.execute(bindings);
        }else{
            return falseStatement.execute(bindings);
        }
    }
}
