import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int hour, minute, second;

    public Time() {
        GregorianCalendar calendar = new GregorianCalendar();

        hour = calendar.get(GregorianCalendar.HOUR);
        minute = calendar.get(GregorianCalendar.MINUTE);
        second = calendar.get(GregorianCalendar.SECOND);
    }

    public Time(long milliseconds) {
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.setTimeInMillis(milliseconds);

        hour = calendar.get(GregorianCalendar.HOUR);
        minute = calendar.get(GregorianCalendar.MINUTE);
        second = calendar.get(GregorianCalendar.SECOND);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime){
        long seconds = elapseTime / 1000;
        int minutes = (int)(seconds / 60);

        this.hour = minutes / 60;
        this.minute = minutes % 60;
        this.second = second % 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
