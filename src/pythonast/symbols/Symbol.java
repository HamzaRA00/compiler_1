package pythonast.symbols;

public class Symbol {
    public final String name;
    public final SymbolKind kind;
    public final int line;

    public Symbol(String name, SymbolKind kind, int line) {
        this.name = name;
        this.kind = kind;
        this.line = line;
    }
}
