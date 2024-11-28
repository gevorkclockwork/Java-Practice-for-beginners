package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Red");
        car.setYear(2015);

        Motorbike motorbike = new Motorbike("Honda", "Green", 2010);

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2024));
        System.out.println(motorbike.yearDifference(2024));

    }
}
