package module9;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello");
            writer.println("World");
        }
    }
}
