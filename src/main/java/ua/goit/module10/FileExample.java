package ua.goit.module10;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String absolutePath = "C:\\Users\\serhi\\Documents\\java\\GoIT\\practicalTraining\\src\\main\\resources\\file.txt";
        File file = new File(absolutePath);

        if (!file.exists()) {
            throw new RuntimeException("File with name " + file.getName() + " not exists");
        }

        try(FileInputStream inputStream = new FileInputStream(absolutePath);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {

            int ch = bufferedInputStream.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = bufferedInputStream.read();
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
}
