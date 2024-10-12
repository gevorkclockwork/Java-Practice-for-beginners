package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2015, 145, 10540);
        airplane.info();
        airplane.setYear(2024);
        airplane.setLength(164);
        airplane.fillUp(10);
        airplane.info();
        airplane.fillUp(15);
        airplane.info();
    }
}
