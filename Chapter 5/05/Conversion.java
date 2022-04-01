public class Conversion {
    public static void main(String[] args) {
        int celsius = 0;
        int fahrenheitC = 20;

        System.out.println("Celcius      Fahrenheit   |   Fahrenheit      Celcius");

        while (celsius <= 100) {
            double fahrenheit = celsius * 9 / 5.0 + 32;
            Double celsiusF = 5 * (fahrenheitC - 32) / 9.0;

            System.out.println(celsius + "             " + fahrenheit + "        |   " + fahrenheitC +
                    "              " + celsiusF);
            celsius += 2;
            fahrenheitC += 5;
        }
    }
}
