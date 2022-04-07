public class Test {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);

        if(integer.isEven())
            System.out.println(integer.getValue() + " is even");
        else
            System.out.println(integer.getValue() + " is not even");

        if(integer.isOdd())
            System.out.println(integer.getValue() + " is odd");
        else
            System.out.println(integer.getValue() + " is not odd");

        if(integer.isPrime())
            System.out.println(integer.getValue() + " is prime");
        else
            System.out.println(integer.getValue() + " is not prime");

        if(MyInteger.isEven(5))
            System.out.println("5 is even");
        else
            System.out.println("5 is not even");

        if(MyInteger.isOdd(5))
            System.out.println("5 is odd");
        else
            System.out.println("5 is not odd");

        if(MyInteger.isPrime(5))
            System.out.println("5 is prime");
        else
            System.out.println("5 is not prime");

        if(MyInteger.isEven(integer))
            System.out.println(integer.getValue() + " is even");
        else
            System.out.println(integer.getValue() + " is not even");

        if(MyInteger.isOdd(integer))
            System.out.println(integer.getValue() + " is odd");
        else
            System.out.println(integer.getValue() + " is not odd");

        if(MyInteger.isPrime(integer))
            System.out.println(integer.getValue() + " is prime");
        else
            System.out.println(integer.getValue() + " is not prime");

        if(integer.equals(5))
            System.out.println(integer.getValue() + " is equal 5");
        else
            System.out.println(integer.getValue() + " is not equal 5");

        MyInteger integer1 = new MyInteger(10);

        if(integer.equals(integer1))
            System.out.println(integer.getValue() + " is equal " + integer1.getValue());
        else
            System.out.println(integer.getValue() + " is not equal " + integer1.getValue());

        char[] chars = {'1', '2', '4', '5'};
        System.out.println(MyInteger.parseInt(chars));
    }
}
