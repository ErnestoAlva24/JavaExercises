public class Ascci {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            System.out.print(((char) i) + " ");
            count++;

            if (count == 10) {
                count = 0;
                System.out.println();
            }
        }
    }
}
