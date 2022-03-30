public class RandomPoint {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 50) - 25;
        int y = (int) (Math.random() * 150) - 75;

        System.out.println("(" + x + "," + y + ")");
    }
}
