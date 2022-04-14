public class Test {
    public static void main(String[] args) {
        GeometricObject[] a = {
                new Circle(2),
                new Circle(5),
                new Rectangle(3, 4),
                new Rectangle(6, 3)
        };

        System.out.println("Total area: " + sumArea(a));
    }

    public static double sumArea(GeometricObject[] a){
        double sum = 0;

        for(GeometricObject obj:a)
            sum += obj.getArea();

        return sum;
    }
}
