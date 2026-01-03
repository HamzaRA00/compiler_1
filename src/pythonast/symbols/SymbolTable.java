package pythonast.symbols;

import java.util.ArrayList;
import java.util.List;

public class SymbolTable {
    public final List<Symbol> symbols = new ArrayList<>();

    public void add(Symbol s) {
        if (s != null) symbols.add(s);
    }
}
