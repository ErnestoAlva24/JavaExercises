import java.io.IOException;
import java.io.RandomAccessFile;

public class Count {
    public static void main(String[] args) {
        try (RandomAccessFile inout = new RandomAccessFile("Exercise17_08.dat", "rw")) {
            if (inout.length() == 0)
                inout.writeInt(1);
            else {
                int count = inout.readInt();
                System.out.println(count);
                
                inout.seek(0);
                inout.writeInt(++count);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
