package pythonast.atoms;

import pythonast.Expression;

public class StringAtom extends Expression {
    public final String text;

    public StringAtom(int line, String text) {
        super(line);
        this.text = text;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + " value=" + text;
    }
}
