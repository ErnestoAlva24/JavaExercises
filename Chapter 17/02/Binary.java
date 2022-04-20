import java.io.FileOutputStream;
import java.io.IOException;

public class Binary {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("Exercise17_02.dat", true)) {
            for (int i = 0; i < 100; i++)
                output.write((int) (1 + Math.random() * 100));
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}