public class Test {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("C1 area is " + c1.getArea());
        System.out.println("C1 perimeter is " + c1.getPerimeter());

        System.out.println("C1" + (c1.contains(3, 3)? "":" not") + " contains the point (3, 3)");
        System.out.println("C1" + (c1.contains(new Circle2D(4, 5, 10.5))? "":" not")
                + " contains the circle with radius 10.5 centered at the position (4, 5)");
        System.out.println("C1" + (c1.overlaps(new Circle2D(3, 5, 2.3))? "":" not")
                + " overlaps the circle with radius 2.3 centered at the position (3, 5)");
    }
}
