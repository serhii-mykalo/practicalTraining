package ua.goit.module10;

import java.io.*;

public class WriteToFileExample {
    private static final String ABSOLUTE_PATH = "C:\\Users\\serhi\\Documents\\java\\GoIT\\practicalTraining\\src\\main\\resources\\out\\file.txt";

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
            String content = "This we will add to a file\nHello World#";
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException e) {
            System.err.println("EXEPTION!!! " + e.getMessage());
        }
    }
}
