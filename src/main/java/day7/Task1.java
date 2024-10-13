package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2020, 176, 10500);
        Airplane airplane2 = new Airplane("AirBus", 2024, 176, 10500);
        Airplane.compareAirplanes(airplane1, airplane2);

    }
}