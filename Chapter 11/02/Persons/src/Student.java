public class Student extends Person{
    public static int FRESHMAN = 0;
    public static int SOPHOMORE = 1;
    public static int JUNIOR = 2;
    public static int SENIOR = 3;

    private final int CLASS_STATUS;

    public Student() {
        CLASS_STATUS = FRESHMAN;
    }

    public Student(String name, String address, String phone, String email, int classStatus) {
        super(name, address, phone, email);
        this.CLASS_STATUS = classStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                '}';
    }

    public int getCLASS_STATUS() {
        return CLASS_STATUS;
    }
}
