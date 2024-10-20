package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Ivan");
        User user2 = new User("James");
        User user3 = new User("Stefan");

        user1.sendMessage(user2, "Привет, эй ты как тебя там!");
        user1.sendMessage(user2, "Пойдешь гулять сегодня?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Нет, не пойду.");
        user2.sendMessage(user1, "А ты куда собрался?");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Чем занят?");
        user3.sendMessage(user1, "В школе был?");

        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Дома сижу");
        user1.sendMessage(user3, "Неа");

        user3.sendMessage(user1, "Все с тобой понятно, ладно пока!");

        MessageDatabase.showDialog(user1, user3);
    }
}
