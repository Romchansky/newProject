package module10;

import java.util.*;
import  java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdasDemo {

    private static List<String> emails = Arrays.asList("oleksandr@gmail.com", "roman@gmail.com",
            "igor.tratyak@mail.ru", "anton@yande.ru", "serhii@google.com");



    public static void main(String[] args) {

        Predicate<String> function = email -> email.contains("@gmail.com") && email.length() > 20;
        checkEmail(emails, function);
        checkEmail(emails, email -> email.contains("@gmail.com"));



    }


    private static List<String> checkEmail(List<String> emails, Predicate<String> function) {
        List<String> result = new ArrayList<>();
        for (String email : emails) {
            if (function.test(email)) {
                result.add(email);
            }
        }
        return result;
    }


}
