package pythonast.stmt;

import pythonast.Statement;

public class GlobalStmt extends Statement {
    public final String text;

    public GlobalStmt(int line, String text) {
        super(line);
        this.text = text;
    }
}
