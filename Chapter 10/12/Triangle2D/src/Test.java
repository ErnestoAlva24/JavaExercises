public class Test {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
                new MyPoint(5, 3.5));

        System.out.println("Triangle area is " + t1.getArea());
        System.out.println("Triangle perimeter is " + t1.getPerimeter());
    }
}
