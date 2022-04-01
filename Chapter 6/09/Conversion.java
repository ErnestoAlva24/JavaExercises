public class Conversion {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds       |   Pounds    Kilograms");
        System.out.println("----------------------------------------------------");

        for (int i = 1, j = 20; i <= 199 && j <= 515; i += 2, j += 5) {
            System.out.println(i + "          " + kilogramToPound(i) + "         |   " +
                    j + "        " + poundToKilogram(j));
        }
    }

    public static double poundToKilogram(double pound) {
        return pound * 0.453;
    }

    public static double kilogramToPound(double kilogram) {
        return kilogram * 2.204;
    }
}
