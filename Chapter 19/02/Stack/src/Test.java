import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five strings: ");

        for (int i = 0; i < 5; i++)
            stack.push(input.nextLine());

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
