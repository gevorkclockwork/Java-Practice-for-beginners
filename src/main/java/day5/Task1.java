package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setModel("Camry");
        car.setColor("Red");
        car.setReleaseYear(2024);

        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Release year: " + car.getReleaseYear());
    }
}
