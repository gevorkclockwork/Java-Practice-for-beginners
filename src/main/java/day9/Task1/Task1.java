package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Геворк", "А-1356");
        Teacher teacher = new Teacher("Сергей Петрович", "Математика");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

        System.out.println(student.getName());
        System.out.println(teacher.getName());
    }
}
