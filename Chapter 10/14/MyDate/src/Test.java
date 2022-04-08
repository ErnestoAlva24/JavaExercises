public class Test {
    public static void main(String[] args) {
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);

        System.out.println("Date 1: " + d1.getMonth() + "/" + d1.getDay() + "/" + d1.getYear());
        System.out.println("Date 2: " + d2.getMonth() + "/" + d2.getDay() + "/" + d2.getYear());
    }
}
