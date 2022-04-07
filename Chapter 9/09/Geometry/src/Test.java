public class Test {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon(6, 4);

        System.out.println("Regular polygon 1 area is " + rp1.getArea());
        System.out.println("Regular polygon 1 perimeter is " + rp1.getPerimeter());

        RegularPolygon rp2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Regular polygon 2 area is " + rp2.getArea());
        System.out.println("Regular polygon 2 perimeter is " + rp2.getPerimeter());
    }
}
