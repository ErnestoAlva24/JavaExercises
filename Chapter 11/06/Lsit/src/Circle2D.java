public class Circle2D {
    private double x, y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return Math.PI * radius * 2;
    }

    public boolean contains(double x, double y){
        double d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));

        return d <= radius;
    }

    public boolean contains(Circle2D circle){
        double d = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2))
                + circle.radius;

        return d <= this.radius;
    }

    public boolean overlaps(Circle2D circle){
        double d = Math.sqrt(Math.pow(this.x - circle.getX(), 2) + Math.pow(this.y - circle.getY(), 2));

        return d < this.radius + circle.radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
