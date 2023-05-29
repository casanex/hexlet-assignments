package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage db) {
        Set<String> keyset = new TreeSet<>(db.toMap().keySet()) {
        };
        for (var key : keyset) {
            var tempValue = db.get(key, "default");
            db.unset(key);
            db.set(tempValue, key);
        }
    }
}

