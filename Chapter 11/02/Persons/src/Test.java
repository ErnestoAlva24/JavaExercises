public class Test {
    public static void main(String[] args) {
        Person person = new Person("Ernesto", "address", "1234567890", "mail");
        System.out.println(person);

        Student student = new Student("Eduardo", "address", "1234567890", "mail",
                Student.FRESHMAN);
        System.out.println(student);

        Employee employee = new Employee("Julio", "address", "1234567890", "mail",
                "office", 100, new MyDate());
        System.out.println(employee);

        Faculty faculty = new Faculty("Ricardo", "address", "1234567890", "mail",
                "office", 100, new MyDate(), 1, "rank");
        System.out.println(faculty);

        Staff staff = new Staff("Ricardo", "address", "1234567890", "mail",
                "office", 100, new MyDate(),"title");
        System.out.println(staff);
    }
}
