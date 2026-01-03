package pythonast.atoms;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class DictEntry extends Expression {
    public final Expression key;
    public final Expression value;

    public DictEntry(int line, Expression key, Expression value) {
        super(line);
        this.key = key;
        this.value = value;
    }

    @Override
    public List<AstNode> children() {
        List<AstNode> list = new ArrayList<>();
        if (key != null) list.add(key);
        if (value != null) list.add(value);
        return list;
    }
}
