public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width: " + r1.getWidth());
        System.out.println("Rectangle 1 height: " + r1.getHeight());
        System.out.println("Rectangle 1 area: " + r1.getArea());
        System.out.println("Rectangle 1 perimeter: " + r1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2 width: " + r2.getWidth());
        System.out.println("Rectangle 2 height: " + r2.getHeight());
        System.out.println("Rectangle 2 area: " + r2.getArea());
        System.out.println("Rectangle 2 perimeter: " + r2.getPerimeter());
    }
}
