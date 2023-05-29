package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private final HashMap<String, String> hm;
    public InMemoryKV(Map<String, String> storage) {
        this.hm = new HashMap<>();
        this.hm.putAll(storage);
    }
        public void set(String key, String value) {
        hm.put(key, value);
    }

    public void unset(String key) {
        hm.remove(key);
    }

        public String get(String key, String defaultValue) {

        return hm.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(this.hm);
    }
}
// END
