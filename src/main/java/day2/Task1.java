package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numbersOfFloors = in.nextInt();


        if (numbersOfFloors > 0 && numbersOfFloors < 5) {
            System.out.println("Малоэтажный дом");
        } else if (numbersOfFloors > 4 && numbersOfFloors < 9) {
            System.out.println("Среднеэтажный дом");
        } else if (numbersOfFloors > 8) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}

