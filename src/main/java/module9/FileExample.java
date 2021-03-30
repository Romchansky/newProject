package module9;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        String absolutePath = "C:\\Users\\romka\\IdeaProjects\\NewProject\\src\\main\\resources\\file1.txt";
        File file = new File(absolutePath);

        if(!file.exists()) {
            throw new RuntimeException("File with name: " + file.getName() + " not exist");
        }

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))) {
            int ch = bufferedInputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bufferedInputStream.read();
            }
        }catch (IOException e) {
            System.err.print(e.getMessage());
        }

    }
}
