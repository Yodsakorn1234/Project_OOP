package Back_End.Project.Parse;
import Back_End.Project.Statement.Node.*;
import java.util.List;

public interface Parser {
    List<ExecuteNode> parse();
}
