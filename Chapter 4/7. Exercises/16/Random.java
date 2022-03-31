public class Random {
    public static void main(String[] args) {
        int value = (int) ((Math.random() * (122 - 97)) + 97);

        System.out.println((char) value);
    }
}
