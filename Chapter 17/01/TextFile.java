import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        File file = new File("Exercise17_01.txt");
        if (file.exists())
            try (Scanner input = new Scanner(file);) {
                while (input.hasNext())
                    list.add(input.nextLine());
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            }

        for (int i = 0; i < 100; i++)
            list.add(((int) (Math.random() * 100)) + " ");

        try (PrintWriter output = new PrintWriter(file);) {
            for (String l : list)
                output.print(l);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
