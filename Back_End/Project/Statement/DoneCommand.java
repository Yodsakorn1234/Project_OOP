package Back_End.Project.Statement;

import Back_End.Project.GameProcess.Game;

public class DoneCommand {
    public DoneCommand(){
    }

    @Override
    public boolean execute(Game bindings) {
        return false;
    }
}
