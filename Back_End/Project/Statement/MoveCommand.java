package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class MoveCommand extends Node.ExecuteNode {
    protected DirectionNode direction;

    public MoveCommand(DirectionNode direction){
        this.direction = direction;
    }

    @Override
    public boolean execute(Game bindings) {
        return bindings.move(direction);
    }
}
