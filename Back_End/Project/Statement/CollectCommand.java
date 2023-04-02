package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class CollectCommand {
    protected Node.ExpressionNode expressionNode;

    public CollectCommand(Node.ExpressionNode expressionNode){
        this.expressionNode = expressionNode;
    }

    @Override
    public boolean execute(Game bindings) {
        return bindings.collect(expressionNode.evaluate(bindings));
    }
}

