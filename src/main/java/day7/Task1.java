package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Airbus", 1999, 40, 10000);
        Airplane airplane2 = new Airplane("Boeing", 2010, 40, 10000);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}