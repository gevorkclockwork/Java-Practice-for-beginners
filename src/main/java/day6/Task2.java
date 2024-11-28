package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2020, 30, 30000);

        airplane.setYear(2025);
        airplane.setLength(35);

        airplane.fillUp(30);
        airplane.fillUp(3000);

        airplane.info();

    }
}
