package pythonast.atoms;

import pythonast.Expression;

public class TrueAtom extends Expression {
    public TrueAtom(int line) {
        super(line);
    }

    @Override
    public String nodeInfo() {
        return super.nodeInfo() + " value=True";
    }
}

