package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike("Honda", "Green", 2020);
        System.out.println(motorbike.getModel());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getYear());
    }
}