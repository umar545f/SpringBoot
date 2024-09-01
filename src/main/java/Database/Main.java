package Database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        // Define columns
        Map<String, Column> userColumns = new HashMap<>();
        userColumns.put("id", new Column("id", true));
        userColumns.put("name", new Column("name", false));
        userColumns.put("email", new Column("email", false));

        // Create a table
        db.createTable("users", userColumns);

        // Insert data
        Map<String, Object> row1 = new HashMap<>();
        row1.put("id", 1);
        row1.put("name", "Alice");
        row1.put("email", "alice@example.com");


        db.getTable("users").insert(row1);


        // Query data
        Map<String, Object> conditions = new HashMap<>();
        conditions.put("id", 1);

        List<Row> result = db.getTable("users").query(conditions);
        for (Row row : result) {
            System.out.println(row.getData());
        }

        // Update data
        Map<String, Object> updateData = new HashMap<>();
        updateData.put("email", "alice@newdomain.com");
        db.getTable("users").update(conditions, updateData);

        // Query again to see the updated data
        result = db.getTable("users").query(conditions);
        for (Row row : result) {
            System.out.println(row.getData());
        }

        // Delete data
        db.getTable("users").delete(conditions);

        // Query to see the remaining data
        result = db.getTable("users").query(new HashMap<>());
        for (Row row : result) {
            System.out.println(row.getData());
        }
    }
}
