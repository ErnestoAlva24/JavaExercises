public class Test {
    public static void main(String[] args) {
        Course course = new Course("Course");

        course.addStudent("Student 1");
        course.addStudent("Student 2");
        course.addStudent("Student 3");

        course.dropStudent("Student 2");

        System.out.println("Students:");

        for(String student:course.getStudents())
            System.out.println(student);
    }
}
