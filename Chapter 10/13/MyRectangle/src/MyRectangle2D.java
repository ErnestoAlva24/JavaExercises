public class MyRectangle2D {
    private double x, y;
    private double width, height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return (height + width) * 2;
    }

    public boolean contains(double x, double y){
        return Math.abs(this.x - x) < width / 2 && Math.abs(this.y - y) < height / 2;
    }

    public boolean contains(MyRectangle2D r){
        return Math.abs(this.x - r.x) < this.width / 2 - r.width / 2
                && Math.abs(this.y - r.y) < this.height / 2 - r.height / 2 ;
    }

    public boolean overlaps(MyRectangle2D r){
        return Math.abs(this.x - r.x) < this.width / 2 + r.width / 2
                && Math.abs(this.y - r.y) < this.height / 2 + r.height / 2 ;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
