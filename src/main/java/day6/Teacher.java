package day6;

import java.util.Random;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int intValue = random.nextInt(4) + 2;
        String stringValue;
        switch (intValue) {
            case 5:
                stringValue = "отлично";
                break;
            case 4:
                stringValue = "хорошо";
                break;
            case 3:
                stringValue = "удовлетворительно";
                break;
            default:
                stringValue = "неудовлетворительно";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + stringValue);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

