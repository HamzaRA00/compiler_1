package pythonast.atoms;

import pythonast.Expression;

public class NumberAtom extends Expression {
    public final String text;

    public NumberAtom(int line, String text) {
        super(line);
        this.text = text;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + " value=" + text;
    }
}
