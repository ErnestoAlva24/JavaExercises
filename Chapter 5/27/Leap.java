public class Leap {
    public static void main(String[] args) {
        int years = 0;
        int count = 0;

        for (int i = 2014; i <= 2114; i++) {
            if ((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0))) {
                years++;

                if (count < 10) {
                    System.out.print(i + " ");
                    count++;
                } else {
                    System.out.println(i);
                    count = 0;
                }
            }
        }

        System.out.println("\nTotal leap years: " + years);
    }
}
