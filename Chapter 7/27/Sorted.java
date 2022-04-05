import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int n = input.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = input.nextInt();

        if (!isSortedConstantInterval(list))
            System.out.println("The list is not sorted with a constant interval");
        else
            System.out.println("The list is sorted with a constant interval");
    }

    public static boolean isSortedConstantInterval(int[] list) {
        int interval = 0;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
            else {
                if (interval == 0)
                    interval = list[i + 1] - list[i];
                else {
                    if (list[i + 1] - list[i] != interval)
                        return false;
                }
            }
        }

        return true;
    }
}
