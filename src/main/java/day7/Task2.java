package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);

        Player.info();
        System.out.println("Игроков на поле: " + Player.getCountPlayers());

        Player player7 = new Player(random.nextInt(11) + 90);
        Player player8 = new Player(random.nextInt(11) + 90);

        Player.info();
        System.out.println("Игроков на поле: " + Player.getCountPlayers());

        System.out.println("Исходная выносливость первого игрока: " + player1.getStamina());

        boolean bool = true;
        while (bool) {
            player1.run();
            System.out.println("Выносливость первого игрока: " + player1.getStamina());
            if (player1.getStamina() == 0) {
                bool = false;
            }
        }
        System.out.println("Игроков на поле: " + Player.getCountPlayers());


    }


}