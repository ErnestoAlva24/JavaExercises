public class Test {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);

        System.out.println("Area: " + octagon.getArea());
        System.out.println("Perimeter: " + octagon.getPerimeter());

        try {
            Octagon clone = (Octagon) octagon.clone();

            System.out.println(octagon.compareTo(clone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
