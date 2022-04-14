public class Test {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();

        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        MyStack stack2 = null;

        try {
            stack2 = (MyStack)stack1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.print("Stack 1: ");
        System.out.println(stack1);
        System.out.print("Stack 2: ");
        System.out.println(stack2);
    }
}
