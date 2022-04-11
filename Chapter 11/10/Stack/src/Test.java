import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack myStack = new MyStack();

        for(int i = 0; i<5; i++){
            System.out.print("Enter a string: ");
            myStack.push(input.nextLine());
        }

        for(int i = 0; i<5; i++)
            System.out.println(myStack.pop());
    }
}
