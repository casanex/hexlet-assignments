package exercise;

import java.sql.SQLOutput;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
            try {
                System.out.println(Math.round(circle.getSquare()) + "\nВычисление окончено");
            } catch (NegativeRadiusException e) {
                System.out.println(e.getErrorDescription());
            }

    }
}
// END
