public class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate hired, String title) {
        super(name, address, phone, email, office, salary, hired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
