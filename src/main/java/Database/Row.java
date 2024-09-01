package Database;

import java.util.Map;

public class Row {
    private Map<String, Object> data;

    public Row(Map<String, Object> data) {
        this.data = data;
    }

    public boolean matches(Map<String, Object> conditions) {
        for (Map.Entry<String, Object> condition : conditions.entrySet()) {
            if (!data.getOrDefault(condition.getKey(), "").equals(condition.getValue())) {
                return false;
            }
        }
        return true;
    }

    public void update(Map<String, Object> newData) {
        data.putAll(newData);
    }

    public Map<String, Object> getData() {
        return data;
    }
}
