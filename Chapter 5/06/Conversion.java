public class Conversion {
    public static void main(String[] args) {
        int ping = 10;
        int sq = 30;

        System.out.println("Ping     Square meter    |     Square meter    Ping");

        while (ping <= 80) {
            System.out.println(ping + "       " + ping * 3.305f + "           |     " + sq +
                    "              " + sq / 3.305f);
            ping += 5;
            sq += 5;
        }
    }
}
