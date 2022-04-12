import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
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

        int characters = 0, words = 0, lines = 0;

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                String line = input.nextLine();
                lines++;

                String[] wordsStr = line.split(" ");
                words += wordsStr.length;

                for (String s : wordsStr)
                    characters += s.length();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(1);
        }

        System.out.println("File " + args[0] + " has ");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }
}
