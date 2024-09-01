package Database;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Table> tables = new HashMap<>();

    public void createTable(String tableName, Map<String, Column> columns) {
        if (tables.containsKey(tableName)) {
            throw new IllegalArgumentException("Table " + tableName + " already exists.");
        }
        tables.put(tableName, new Table(tableName, columns));
    }

    public Table getTable(String tableName) {
        return tables.get(tableName);
    }
}
