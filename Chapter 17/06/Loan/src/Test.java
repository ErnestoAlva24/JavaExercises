import java.io.*;

public class Test {
    public static void main(String[] args) {
        Loan l1 = new Loan(2.5, 1, 1000);
        Loan l2 = new Loan(3.5, 3, 2000);
        Loan l3 = new Loan(4.5, 4, 3000);
        Loan l4 = new Loan(5.5, 5, 4000);
        Loan l5 = new Loan(6.5, 6, 5000);

        try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream("Exercise17_06.dat")));
        ) {
            output.writeObject(l1);
            output.writeObject(l2);
            output.writeObject(l3);
            output.writeObject(l4);
            output.writeObject(l5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
