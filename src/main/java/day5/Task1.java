package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Red");
        car.setYear(2024);
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}
