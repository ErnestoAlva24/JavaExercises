import java.util.ArrayList;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++)
            list1.add(input.nextInt());

        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++)
            list2.add(input.nextInt());

        ArrayList<Integer> list3 = union(list1, list2);

        System.out.print("The combined list is ");

        for (int i = 0; i < list3.size(); i++)
            System.out.print(list3.get(i) + " ");
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++)
            list.add(list1.get(i));

        for (int i = list1.size(); i < list1.size() + list2.size(); i++)
            list.add(list2.get(i - list1.size()));

        return list;
    }
}
