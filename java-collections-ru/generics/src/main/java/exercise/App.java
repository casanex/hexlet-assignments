package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;


class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            int count = 0;
            for (Object valueWhere : where.values()) {
                if (book.containsValue(valueWhere)) {
                    count++;
                }
            }
            if (count == where.size()) {
                result.add(book);
            }
        }
        return result;
    }
}
