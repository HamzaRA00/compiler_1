package pythonast.stmt;

import pythonast.Statement;

public class FromImportStmt extends Statement {
    public final String name;

    public FromImportStmt(int line, String name) {
        super(line);
        this.name = name;
    }

    @Override
    public String nodeInfo() {
        return super.nodeInfo() + (name != null ? " value=" + name : "");
    }
}
