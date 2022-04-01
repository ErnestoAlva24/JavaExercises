public class Conversion {
    public static void main(String[] args) {
        int inches = 0;

        System.out.println("Inches      Centimetres");

        while (inches <= 10) {
            double centimetres = 2.54 * inches;

            System.out.println(inches + "             " + centimetres);
            inches++;
        }
    }
}
