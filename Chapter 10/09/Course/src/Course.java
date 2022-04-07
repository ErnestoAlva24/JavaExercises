public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] std = new String[students.length + 1];

            System.arraycopy(students, 0, std, 0, numberOfStudents);

            students = std;
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] std = new String[numberOfStudents];

        System.arraycopy(students, 0, std, 0, numberOfStudents);

        return std;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;

        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            String[] newStudents = new String[students.length - 1];
            for (int i = 0, j = 0; i < newStudents.length; i++, j++) {
                if (i == index)
                    j++;

                newStudents[i] = students[j];
            }
            this.students = newStudents;
            numberOfStudents--;
        }
        else
            System.out.println(student + " is not in the course");
    }
}
