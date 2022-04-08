public class Points {
    public static void main(String[] args) {
        final double RADIUS = 40;

        double point1 = (Math.random() * (2 * Math.PI));
        double point2 = (Math.random() * (2 * Math.PI));
        double point3 = (Math.random() * (2 * Math.PI));

        double x1 = RADIUS * Math.cos(point1);
        double y1 = RADIUS * Math.sin(point1);
        double x2 = RADIUS * Math.cos(point2);
        double y2 = RADIUS * Math.sin(point2);
        double x3 = RADIUS * Math.cos(point3);
        double y3 = RADIUS * Math.sin(point3);

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        double angleA = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double angleB = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double angleC = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        System.out.println("The three angles are " + Math.round(angleA * 100) / 100.0 + " " +
                Math.round(angleB * 100) / 100.0 + " " + Math.round(angleC * 100) / 100.0);
    }
}
