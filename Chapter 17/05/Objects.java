import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Objects {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6 };

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_05.dat"))) {
            output.writeObject(list);
            output.writeObject(new java.util.Date());
            output.writeDouble(10.5);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
