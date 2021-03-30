package module10;

import java.util.*;
import java.util.function.*;

public class FunctionalInterfaceDemo {
    private static List<String> emails = Arrays.asList("oleksandr@gmail.com", "roman@gmail.com",
            "igor.tratyak@mail.ru", "anton@yandex.ru", "serhii@google.com");


    public static void main(String[] args) {

        // function example
        final Map<String, Integer> result = calculateEmailLetters(emails, email -> email.length());
        System.out.println(result);

        //consumer example
        Consumer<Map<String, Integer>> consumer = map -> {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Email: " + entry.getKey() + ", have " + entry.getValue() + " letters!");
            }
        };
        consumer.accept(result);


        //supplier example
        Supplier<Integer> randomDigit = () -> new Random().nextInt(100) * 50;
        System.out.println(randomDigit.get());
        System.out.println(randomDigit.get());
        System.out.println(randomDigit.get());
        System.out.println(randomDigit.get());

        //binary
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(15,5));

        //unary
        UnaryOperator<Integer> multiplyUnary = (x) -> x*x;
        System.out.println(multiplyUnary.apply(5));

    }

    private static Map<String, Integer> calculateEmailLetters(List<String> emails, Function<String, Integer> function) {
        Map<String, Integer> result = new HashMap<>();
        for (String email : emails) {
            result.put(email, function.apply(email));

        }
        return result;
    }
}
