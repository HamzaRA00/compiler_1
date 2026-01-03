package pythonast;

import java.util.ArrayList;
import java.util.List;

public class ProgramAst extends AstNode {
    public final List<Statement> statements = new ArrayList<>();

    public ProgramAst(int line) {
        super(line);
    }

    public void addStatement(Statement s) {
        if (s != null) {
            statements.add(s);
        }
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(statements);
    }
}

