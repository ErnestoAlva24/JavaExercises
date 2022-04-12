import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        System.out.println(writeInFile("3", new File("file.txt")));
    }

    public static int writeInFile(String name, File file) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String lineFile = input.nextLine();
                list.add(lineFile);
            }
        } catch (FileNotFoundException ex) {
            System.out.println();
        }

        int position = -1;

        for (int i = 0; i < list.size(); i++) {
            String lineFile = list.get(i);
            for (int j = 0; j < name.length() && j < lineFile.length(); j++) {
                if (name.charAt(j) < lineFile.charAt(j))
                    position = i;
                break;
            }

            if (position != -1) {
                list.add(position, name);
                break;
            }
        }

        try (PrintWriter output = new PrintWriter(file)) {
            for (String lineList : list)
                output.println(lineList);
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file.getName() + " does not exist");
            System.exit(1);
        }

        return position;
    }
}
