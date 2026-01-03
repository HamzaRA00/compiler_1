package pythonast.atoms;

import pythonast.AstNode;
import pythonast.Expression;

import java.util.ArrayList;
import java.util.List;

public class DictLiteral extends Expression {
    public final List<DictEntry> entries = new ArrayList<>();

    public DictLiteral(int line) {
        super(line);
    }

    public void add(DictEntry e) {
        if (e != null) entries.add(e);
    }

    @Override
    public List<AstNode> children() {
        return new ArrayList<>(entries);
    }
}
