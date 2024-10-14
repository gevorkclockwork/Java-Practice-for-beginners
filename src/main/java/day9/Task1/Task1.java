package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Сергей", "A-1488");
        Teacher teacher = new Teacher("Иван Иванович", "Алгебра");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();


    }
}
