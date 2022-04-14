public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3, "Red", true);
        Circle circle2 = new Circle(6, "Black", true);

        Rectangle rectangle1 = new Rectangle(3, 5, "Red", true);
        Rectangle rectangle2 = new Rectangle(6, 5, "Black", true);

        System.out.println("The larger of the circles is: " +
                (Circle.max(circle1, circle2) == circle1? "circle1":"circle2"));

        System.out.println("The larger of the rectangles is: " +
                (Rectangle.max(rectangle1, rectangle2) == rectangle1? "rectangle1":"rectangle2"));
    }
}
