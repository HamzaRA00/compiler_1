package pythonast.atoms;

import pythonast.Expression;

public class NameAtom extends Expression {
    public final String name;

    public NameAtom(int line, String name) {
        super(line);
        this.name = name;
    }
}

