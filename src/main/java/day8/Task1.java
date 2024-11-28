package day8;

public class Task1 {
    public static void main(String[] args) {

        String numbers = "";
        StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        //System.out.println(numbers);

        System.out.println();

        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        //System.out.println(sb);

    }

}