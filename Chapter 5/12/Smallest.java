public class Smallest {
    public static void main(String[] args) {
        int num = 1;

        while (Math.pow(num, 3) <= 12000)
            num++;

        System.out.println(num);
    }
}
