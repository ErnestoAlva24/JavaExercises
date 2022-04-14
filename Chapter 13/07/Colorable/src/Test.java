public class Test {
    public static void main(String[] args) {
        GeometricObject[] array = {
                new Square(1),
                new Square(2),
                new Square(3),
                new Square(4),
                new Square(5)
        };

        for (GeometricObject geometricObject : array) {
            System.out.print("Area: " + geometricObject.getArea());

            if (geometricObject instanceof Square) {
                System.out.print(", How to color: ");
                ((Square) geometricObject).howToColor();
            }
        }
    }
}
