package pythonast.atoms;

import pythonast.Expression;

public class FalseAtom extends Expression {
    public FalseAtom(int line) {
        super(line);
    }

    @Override
    public String nodeInfo() {
        return super.nodeInfo() + " value=False";
    }
}

