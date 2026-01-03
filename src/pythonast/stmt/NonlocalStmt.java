package pythonast.stmt;

import pythonast.Statement;

public class NonlocalStmt extends Statement {
    public final String text;

    public NonlocalStmt(int line, String text) {
        super(line);
        this.text = text;
    }

    @Override
    public String nodeInfo() {
        return getClass().getSimpleName() + " line " + line + " value=" + text;
    }
}
