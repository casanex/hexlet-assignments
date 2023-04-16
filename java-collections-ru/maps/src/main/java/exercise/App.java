package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class App {
    public static Map<String, Integer> getWordCount(String str) {
        if (str.isEmpty()) return new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        List<String> list = Arrays.asList(str.split(" "));

        for (String m: list) {
            int count = map1.containsKey(m) ? map1.get(m) + 1 : 1;
            map1.put(m, count);
        }
        return map1;
    }
    public static String toString(Map<String, Integer> first) {
        if (first.isEmpty()) return String.valueOf(new HashMap<>());
        var result = new StringBuilder("{");
        for (Map.Entry<String,Integer> entry: first.entrySet()) {
            String key = (String)entry.getKey();
            Integer value = entry.getValue();
            result.append("  " + key + ": " + value + "\n");

        }
        result.append(" }");
        return result.toString();
        }
}
