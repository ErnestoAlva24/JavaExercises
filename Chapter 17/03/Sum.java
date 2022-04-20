import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sum {
    public static void main(String[] args) {
        try (DataInputStream input = new DataInputStream(new FileInputStream("file.dat"))) {

            double sum = 0;

            try {
                while (true)
                    sum += input.readDouble();
            } catch (IOException ex) {
                System.out.println("The sum is " + sum);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch(IOException ex){
            System.out.println(ex);
        }
    }
}
