package day2;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            int c = a + 1;
            while (c < b) {
                if (c % 5 == 0 && c % 10 != 0) {
                    System.out.print(c + " ");
                }
                c++;
            }
        }

    }
}
