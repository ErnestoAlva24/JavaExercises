import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        File file = new File("file.txt");

        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }

        try {
            System.out.println(readInFile("Hello world", file));
        } catch (FileNotFoundException ex) {
            System.out.println();
        }
    }

    public static int readInFile(String line, File file) throws FileNotFoundException {
        try (Scanner input = new Scanner(file)) {
            int count = 0;
            while (input.hasNextLine()) {
                count++;

                String lineFile = input.nextLine();

                if (line.equals(lineFile))
                    return count;
            }
        } catch (FileNotFoundException ex) {
            throw ex;
        }

        return -1;
    }
}
