package pythonast.atoms;

import pythonast.Expression;

public class NameAtom extends Expression {
    public final String name;

    public NameAtom(int line, String name) {
        super(line);
        this.name = name;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + " value=" + name;
    }
}
