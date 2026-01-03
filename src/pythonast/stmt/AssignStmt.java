package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Expression;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class AssignStmt extends Statement {
    public final Expression target;
    public final Expression value;

    public AssignStmt(int line, Expression target, Expression value) {
        super(line);
        this.target = target;
        this.value = value;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (target != null) list.add(target);
        if (value != null) list.add(value);
        return list;
    }
}
