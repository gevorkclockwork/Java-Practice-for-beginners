package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int intValue = random.nextInt(4) + 2;
        String stringValue = "";

        switch (intValue) {
            case 2:
                stringValue = "неудовлетворительно";
                break;
            case 3:
                stringValue = "удовлетворительно";
                break;
            case 4:
                stringValue = "хорошо";
                break;
            case 5:
                stringValue = "отлично";
                break;
        }

        System.out.println("Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + subject +
                " на оценку " + stringValue);
    }


}

