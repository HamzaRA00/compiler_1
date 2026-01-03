package pythonast.atoms;

import pythonast.Expression;

public class StringAtom extends Expression {
    public final String text;

    public StringAtom(int line, String text) {
        super(line);
        this.text = text;
    }
}

