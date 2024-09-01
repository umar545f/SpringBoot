package Database;

public class Column {
    private String name;
    private boolean primaryKey;

    public Column(String name, boolean primaryKey) {
        this.name = name;
        this.primaryKey = primaryKey;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }
}
