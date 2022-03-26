public class Table {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 1;

        System.out.println("  a         b      Middle Point");
        System.out.println("(" + x1 + ", " + y1 + ")    (" + x2 + ", " + y2 + ")    (" + (x1 + x2) / 2.0 + ", "
                + (y1 + y2) / 2.0 + ")");

        x1 = 1;
        y1 = 4;
        x2 = 4;
        y2 = 2;

        System.out.println("(" + x1 + ", " + y1 + ")    (" + x2 + ", " + y2 + ")    (" + (x1 + x2) / 2.0 + ", "
                + (y1 + y2) / 2.0 + ")");

        x1 = 2;
        y1 = 7;
        x2 = 6;
        y2 = 3;

        System.out.println("(" + x1 + ", " + y1 + ")    (" + x2 + ", " + y2 + ")    (" + (x1 + x2) / 2.0 + ", "
                + (y1 + y2) / 2.0 + ")");

        x1 = 3;
        y1 = 9;
        x2 = 10;
        y2 = 5;

        System.out.println("(" + x1 + ", " + y1 + ")    (" + x2 + ", " + y2 + ")   (" + (x1 + x2) / 2.0 + ", "
                + (y1 + y2) / 2.0 + ")");

        x1 = 4;
        y1 = 11;
        x2 = 12;
        y2 = 7;

        System.out.println("(" + x1 + ", " + y1 + ")   (" + x2 + ", " + y2 + ")   (" + (x1 + x2) / 2.0 + ", "
                + (y1 + y2) / 2.0 + ")");
    }
}
