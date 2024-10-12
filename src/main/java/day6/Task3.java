package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "History");
        Student student = new Student("James");

        teacher.evaluate(student);
    }
}
