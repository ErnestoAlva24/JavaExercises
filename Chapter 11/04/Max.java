import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of integers ending with 0: ");

        ArrayList<Integer> list = new ArrayList<>();

        int n = input.nextInt();

        while (n != 0) {
            list.add(n);
            n = input.nextInt();
        }

        Integer max = max(list);

        System.out.println(max);
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0)
            return null;

        int max = 0;

        for (int n : list)
            if (n > max)
                max = n;

        return max;
    }
}
