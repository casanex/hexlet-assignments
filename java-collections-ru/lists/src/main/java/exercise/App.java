package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class App {
    public static boolean scrabble(String symbols, String word) {

        int length = word.length();
        String[] letterss = symbols.split("");
        List coll = new ArrayList(Arrays.asList(letterss));

        for (int i = 0; i < length; i++) {
            String current = word.substring(i, i + 1).toLowerCase();

            if (!coll.contains(current)) {
                return false;
            }

            coll.remove(current);
        }

        return true;
    }
}