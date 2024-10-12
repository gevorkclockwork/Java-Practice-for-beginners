package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2000);
        Motorbike motorbike = new Motorbike("GSX-R 1000", "Green", 2000);


        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2024));
        System.out.println(car.yearDifference(2024));
    }
}
