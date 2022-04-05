import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];

        for (int i = 0; i < size1; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2 size and contents: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];

        for (int i = 0; i < size2; i++)
            list2[i] = input.nextInt();

        System.out.print("List1 is ");
        for (int i = 0; i < list1.length; i++)
            System.out.print(list1[i] + " ");

        System.out.println();

        System.out.print("List2 is ");
        for (int i = 0; i < list2.length; i++)
            System.out.print(list2[i] + " ");

        System.out.println();

        int[] merge = merge(list1, list2);

        System.out.print("The merged list is ");

        for (int i = 0; i < merge.length; i++)
            System.out.print(merge[i] + " ");

        System.out.println();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merge = new int[list1.length + list2.length];

        int i = 0, j = 0, index = 0;

        while (index < merge.length) {
            if (i == list1.length) {
                merge[index] = list2[j];
                j++;
                index++;
                continue;
            }

            if (j == list2.length) {
                merge[index] = list1[i];
                i++;
                index++;
                continue;
            }

            if (list1[i] < list2[j]) {
                merge[index] = list1[i];
                i++;
            } else {
                merge[index] = list2[j];
                j++;
            }

            index++;
        }

        return merge;
    }
}
