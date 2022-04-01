public class E {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;
        int i = 1;

        while (i <= 10000) {
            item = item / ((double) i);
            e += item;
            i++;
        }

        System.out.println("e = 10000: " + e);

        while (i <= 20000) {
            item = item / ((double) i);
            e += item;
            i++;
        }

        System.out.println("e = 20000: " + e);

        while (i <= 100000) {
            item = item / ((double) i);
            e += item;
            i++;
        }

        System.out.println("e = 100000: " + e);
    }
}
