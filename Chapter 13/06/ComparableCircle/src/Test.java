public class Test {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(10);
        ComparableCircle c2 = new ComparableCircle(15);

        System.out.println("The largest circle is " + (c1.compareTo(c2) > 0 ?"c1":"c2"));
    }
}
