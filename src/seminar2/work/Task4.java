package seminar2.work;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void openFile() {
        try(FileWriter writer = new FileWriter("text.txt")) {
            writer.append(printer());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String printer() {
        StringBuilder str = new StringBuilder();
        str.append("TEST".repeat(100));
        return str.toString();
    }
}
