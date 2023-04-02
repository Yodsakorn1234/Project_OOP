package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class RelocateCommand extends Node.ExecuteNode {
    public RelocateCommand(){
    }

    @Override
    public boolean execute(Game bindings) {
        bindings.relocate();
        return true;
    }
}
