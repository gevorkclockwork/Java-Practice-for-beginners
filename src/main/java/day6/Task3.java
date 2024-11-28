package day6;

import java.util.WeakHashMap;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иван Петрович", "Математика");
        Student student = new Student("Геворк");

        teacher.evaluate(student);
    }
}
