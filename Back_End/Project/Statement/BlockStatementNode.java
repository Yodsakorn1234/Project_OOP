package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

import java.util.List;

public class BlockStatementNode {
    protected List<Node.ExecuteNode> statements;

    public BlockStatementNode(List<Node.ExecuteNode> statements){
        this.statements = statements;
    }

    @Override
    public boolean execute(Game bindings) {
        for(Node.ExecuteNode statement : statements){
            if(!statement.execute(bindings)){
                return false;
            }
        }
        return true;
    }
}
