package module9;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {

    private static byte[] INPUT_BYTE_ARRAY = new byte[]{77, 121, 32, 110, 97, 109, 101, 32, 105, 115, 32, 82, 111, 109, 97, 110, 33};


    public static void main(String[] args) {

        try (InputStreamReader reader = new InputStreamReader(new ByteArrayInputStream(INPUT_BYTE_ARRAY))) {
            int read = reader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = reader.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
