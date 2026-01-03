package pythonast.stmt;

import pythonast.AstNode;
import pythonast.Expression;
import pythonast.Statement;

import java.util.ArrayList;
import java.util.List;

public class ReturnStmt extends Statement {
    public final Expression value;

    public ReturnStmt(int line, Expression value) {
        super(line);
        this.value = value;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (value != null) list.add(value);
        return list;
    }
}

