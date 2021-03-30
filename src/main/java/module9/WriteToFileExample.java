package module9;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    private static final String ABSOLUTE_PATH = "C:\\Users\\romka\\Desktop\\file1.txt";

    public static void main(String[] args) {

        File file = new File(ABSOLUTE_PATH);

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            String content = "This we will add to a file\nHello World00000000000000000000000*\ni create file in my desktop";
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException e) {
            System.out.println("EXCEPTION!!!" + e.getMessage());
        }
    }
}
