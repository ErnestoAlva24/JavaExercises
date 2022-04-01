public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j >= i; j--)
                System.out.print("  ");
            for (int j = 0; j <= i; j++)
                System.out.print(((int) Math.pow(3, j)) + " ");
            for (int j = i - 1; j >= 0; j--)
                System.out.print(((int) Math.pow(3, j)) + " ");
            System.out.println();
        }
    }
}
