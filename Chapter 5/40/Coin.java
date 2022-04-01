public class Coin {
    public static void main(String[] args) {
        int tails = 0, heads = 0;

        for (int i = 0; i < 2000000; i++) {
            int result = (int) (Math.random() * 10) % 2;

            if (result == 0)
                tails++;
            else
                heads++;
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
