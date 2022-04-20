import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Convert SourceFile TargetFile");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The File " + args[0] + " does not exist");
            System.exit(1);
        }

        try (Scanner input = new Scanner(file);
                DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]))) {
            while (input.hasNext())
                output.writeUTF(input.nextLine());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
