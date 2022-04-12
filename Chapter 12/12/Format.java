import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid arguments");
            System.exit(1);
        }

        File file = new File(args[0]);

        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(1);
        }

        String code = "";

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                String line = input.nextLine();

                code += line + "\n";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(args[0])) {
            output.print(code.replace("^[\s|\n][\s]*[\n]*[\s]*[{]$", "{"));
        } catch (FileNotFoundException ex) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }
    }
}
