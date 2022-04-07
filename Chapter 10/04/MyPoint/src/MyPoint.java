public class MyPoint {
    private double x, y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point){
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y + point.y, 2));
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y + y, 2));
    }

    public static double distance(MyPoint point1, MyPoint point2){
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y + point2.y, 2));
    }
}
