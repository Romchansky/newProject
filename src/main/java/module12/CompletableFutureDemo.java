package module12;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture
                .runAsync(() -> System.out.println(Thread.currentThread().getName()));

        CompletableFuture
                .supplyAsync(() -> getValue())
                .thenApply(value -> {
                    throw new IllegalArgumentException("error happens");
                })
                .exceptionally(ex -> {
                    System.out.println(ex.getMessage());
                    return 10;
                })
                .thenAccept(System.out::println);


    }

    private static int getValue() {
        return 10;
    }
}
