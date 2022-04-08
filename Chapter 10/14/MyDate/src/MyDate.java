import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;

    public MyDate() {
        GregorianCalendar cal = new GregorianCalendar();

        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public void setDate(long elapsedTime){
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);

        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
