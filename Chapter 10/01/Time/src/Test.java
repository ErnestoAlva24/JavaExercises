public class Test {
    public static void main(String[] args) {
        Time time = new Time();

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

        time = new Time(555550000);
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

        time = new Time(5, 23, 55);
        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
