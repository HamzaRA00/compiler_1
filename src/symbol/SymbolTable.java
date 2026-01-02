package symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private final Map<String, List<Symbol>> symbols = new HashMap<>();

    public void addSymbol(String name, String type, String value, int line) {
        symbols.computeIfAbsent(name, k -> new ArrayList<>()).add(new Symbol(name, type, value, line));
    }

    public Map<String, List<Symbol>> getSymbols() {
        return symbols;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Symbol Table ---\n");
        sb.append(String.format("%-15s | %-10s | %-20s | %-5s\n", "Name", "Type", "Value", "Line"));
        sb.append("-".repeat(60)).append("\n");
        for (List<Symbol> symbolList : symbols.values()) {
            for (Symbol s : symbolList) {
                sb.append(String.format("%-15s | %-10s | %-20s | %-5d\n", 
                    s.getName(), s.getType(), s.getValue(), s.getLine()));
            }
        }
        return sb.toString();
    }

    public void merge(SymbolTable other) {
        for (Map.Entry<String, List<Symbol>> entry : other.getSymbols().entrySet()) {
            String name = entry.getKey();
            List<Symbol> otherSymbols = entry.getValue();
            symbols.computeIfAbsent(name, k -> new ArrayList<>()).addAll(otherSymbols);
        }
    }

    public static class Symbol {
        private final String name;
        private final String type;
        private final String value;
        private final int line;

        public Symbol(String name, String type, String value, int line) {
            this.name = name;
            this.type = type;
            this.value = value;
            this.line = line;
        }

        public String getName() { return name; }
        public String getType() { return type; }
        public String getValue() { return value; }
        public int getLine() { return line; }
    }
}
