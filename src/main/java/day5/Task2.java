package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("GSX-R 1000", "Green", 2024);
        System.out.println("Model: " + motorbike.getModel());
        System.out.println("Color: " + motorbike.getColor());
        System.out.println("Release year: " + motorbike.getReleaseYear());
    }
}