package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;
import Back_End.Project.Statement.Node;

import java.util.Map;

public class AssignmentStatementNode {
    protected String identifier;
    protected Node.ExpressionNode expressionNode;

    public AssignmentStatementNode(String identifier, Node.ExpressionNode expressionNode){
        this.identifier = identifier;
        this.expressionNode = expressionNode;
    }

    @Override
    public boolean execute(Game bindings) {
        Map<String, Long> store = bindings.identifiers();
        store.put(identifier, expressionNode.evaluate(bindings));
        return true;
    }

    public Node.ExecuteNode execute(Map<String, Long> map){
        if(!(expressionNode instanceof VariableExpressionNode)){
            throw new NodeException.IntegerRequire(expressionNode.toString());
        }
        map.put(identifier, ((VariableExpressionNode) expressionNode).evaluate());
        return next;
    }
}
