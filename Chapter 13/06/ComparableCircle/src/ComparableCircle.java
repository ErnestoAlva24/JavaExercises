public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {}

    public ComparableCircle(double radius) {
        this.setRadius(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        this.setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    @Override
    public int compareTo(ComparableCircle c) {
        return Double.compare(this.getArea(), c.getArea());
    }
}
