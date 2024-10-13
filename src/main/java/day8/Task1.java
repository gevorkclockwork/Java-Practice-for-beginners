package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        String numbers = "";
        for (int i = 0; i < 20001; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers);
        long stopTime1 = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            stringBuilder.append(i + " ");
        }
        System.out.println(stringBuilder);
        long stopTime2 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}