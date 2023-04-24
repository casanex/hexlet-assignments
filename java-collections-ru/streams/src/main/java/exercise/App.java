package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


class App {
    public static Integer getCountOfFreeEmails(List<String> emailsList) {
        Integer amount = (int) emailsList.stream()
                .filter(email -> email.endsWith("yandex.ru") || email.endsWith("gmail.com") || email.endsWith("hotmail.com"))
                .count();
                
        return amount;
    }
}
