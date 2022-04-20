import java.io.*;

public class Test {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("Exercise17_06.dat")))) {
            while (true) {
                Loan loan = (Loan)input.readObject();
                System.out.println(loan);
                System.out.println();
            }
        }
        catch (EOFException ex) {
            System.out.println();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
