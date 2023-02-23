import java.util.Map;

public class Player implements Configurationfile,ActionCommand,MoveCommand,InfoExpreesion,Time,Map {
    static long init_budget;
    private String name;
    boolean Turn;
    int CountTurn =0;
    protected int XCitycenter; // ต่ำแหน่งในแนวแกน x ของ Citycenter
    protected int YCitycenter; //ต่ำแหน่งในแนวแกน y  ของ Citycenter
    protected int XPlayer;   // ต่ำแหน่งในแนวแกน x ของผู้เล่น
    protected int YPlayer;  // ต่ำแหน่งในแนวแกน y ของผู้เล่น
    public Player(String name) {                                            //สร้างตัวละคร
        this.name = name;
        init_budget = Configurationfile.init_budget;
    }

    @Override
    public void Done() {

    }

    @Override
    public void reset() {

    }

    @Override
    public void Relocate(int x, int y) {

    }

    @Override
    public void MoveUp() {

    }

    @Override
    public void MoveUpLeft() {

    }

    @Override
    public void MoveUpRight() {

    }

    @Override
    public void MoveDown() {

    }

    @Override
    public void MoveDownLeft() {

    }

    @Override
    public void MoveDownRight() {

    }
}
