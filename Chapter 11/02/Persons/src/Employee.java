public class Employee extends Person{
    private String office;
    private double salary;
    private MyDate hired;

    public Employee() {}

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate hired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hired = hired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHired() {
        return hired;
    }

    public void setHired(MyDate hired) {
        this.hired = hired;
    }
}
