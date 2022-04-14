public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this.side = 0;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
