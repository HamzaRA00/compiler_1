package pythonast.symbols;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SymbolPrinter {
    public List<String> print(SymbolTable table) {
        List<String> out = new ArrayList<>();
        List<Symbol> syms = new ArrayList<>(table.symbols);
        syms.sort(Comparator.comparingInt(a -> a.line));
        for (Symbol sym : syms) {
            out.add(sym.kind + " " + sym.name + " line " + sym.line);
        }
        return out;
    }
}
