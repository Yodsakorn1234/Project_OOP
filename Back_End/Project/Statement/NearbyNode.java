package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class NearbyNode extends Node.ExpressionNode {
    protected DirectionNode direction;

    public NearbyNode(DirectionNode direction){
        this.direction = direction;
    }

    @Override
    public long evaluate(Game bindings) {
        return bindings.nearby(direction);
    }

    @Override
    public String toString() {
        return "nearby " + direction;
    }
}
