package Back_End.Project.Statement;

public class IfStatementNode extends ConditionStatementNode{
    public IfStatementNode(Node.ExpressionNode conditionNode, Node.ExecuteNode trueStatement, Node.ExecuteNode falseStatement) {
        super(conditionNode, trueStatement, falseStatement);

    }
}
