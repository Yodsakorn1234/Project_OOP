package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class OpponentNode  extends Node.ExpressionNode {
    public OpponentNode(){

    }
    @Override
    public long evaluate(Game bindings) {
        return bindings.opponent();
    }

    @Override
    public String toString() {
        return "opponent";
    }
}
