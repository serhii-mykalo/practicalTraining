package ua.goit.module10;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReaderExample {
    private static final String ABSOLUTE_PATH = "C:\\Users\\serhi\\Documents\\java\\GoIT\\practicalTraining\\src\\main\\resources\\writer\\file.txt";

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

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello World\nHow are you today?");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try (FileReader reader = new FileReader(file)) {
            int ch = reader.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = reader.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
