package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private String name;
    private Map<String, Column> columns;
    private List<Row> rows = new ArrayList<>();
    private String primaryKey;
    private Map<Object, Row> primaryKeyIndex = new HashMap<>();

    public Table(String name, Map<String, Column> columns) {
        this.name = name;
        this.columns = columns;
        for (Map.Entry<String, Column> entry : columns.entrySet()) {
            if (entry.getValue().isPrimaryKey()) {
                if (this.primaryKey != null) {
                    throw new IllegalArgumentException("Multiple primary keys are not allowed.");
                }
                this.primaryKey = entry.getKey();
            }
        }
    }

    public void insert(Map<String, Object> data) {
        if (primaryKey != null) {
            Object primaryKeyValue = data.get(primaryKey);
            if (primaryKeyIndex.containsKey(primaryKeyValue)) {
                throw new IllegalArgumentException("Primary key violation.");
            }
        }

        Row newRow = new Row(data);
        rows.add(newRow);

        if (primaryKey != null) {
            primaryKeyIndex.put(data.get(primaryKey), newRow);
        }
    }

    public void delete(Map<String, Object> conditions) {
        rows.removeIf(row -> row.matches(conditions));
    }

    public void update(Map<String, Object> conditions, Map<String, Object> newData) {
        for (Row row : rows) {
            if (row.matches(conditions)) {
                row.update(newData);
                if (primaryKey != null) {
                    primaryKeyIndex.put(row.getData().get(primaryKey), row);
                }
            }
        }
    }

    public List<Row> query(Map<String, Object> conditions) {
        List<Row> result = new ArrayList<>();
        for (Row row : rows) {
            if (row.matches(conditions)) {
                result.add(row);
            }
        }
        return result;
    }
}
