public class Faculty extends Employee{
    private int hours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate hired, int hours, String rank) {
        super(name, address, phone, email, office, salary, hired);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
