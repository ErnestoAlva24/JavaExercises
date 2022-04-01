public class Sum {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i < 1000; i++)
            sum += 1 / (i + Math.sqrt(i + 1));

        System.out.println(sum);
    }
}
