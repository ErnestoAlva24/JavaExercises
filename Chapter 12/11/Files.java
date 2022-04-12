import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        File file = new File(args[1]);

        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }

        ArrayList<String> lines = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.nextLine();

                lines.add(line.replaceAll(args[0], ""));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(args[1])) {
            for (String line : lines)
                output.println(line);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }
    }
}
