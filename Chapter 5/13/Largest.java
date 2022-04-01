public class Largest {
    public static void main(String[] args) {
        int num = 1;

        while (Math.pow(num, 2) < 12000)
            num++;

        num--;
        System.out.println(num);
    }
}
