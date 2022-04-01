public class Conversion {
    public static void main(String[] args) {
        int celsius = 0;

        System.out.println("Celcius      Fahrenheit");

        while (celsius <= 100) {
            double fahrenheit = celsius * 9 / 5.0 + 32;

            System.out.println(celsius + "             " + fahrenheit);
            celsius += 2;
        }
    }
}
