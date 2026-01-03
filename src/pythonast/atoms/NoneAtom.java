package pythonast.atoms;

import pythonast.Expression;

public class NoneAtom extends Expression {
    public NoneAtom(int line) {
        super(line);
    }

    @Override
    public String nodeInfo() {
        return super.nodeInfo() + " value=None";
    }
}

