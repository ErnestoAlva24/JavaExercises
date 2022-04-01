public class Conversion {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers    |   Kilometers    Miles");
        System.out.println("----------------------------------------------------");

        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
            System.out.println(i + "       " + mileToKilometer(i) + "           |   " +
                    j + "         " + kilometerToMile(j));
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}
