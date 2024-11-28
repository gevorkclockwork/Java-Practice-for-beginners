package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("Gevork");
        User user2 = new User("Ivan");
        User user3 = new User("John");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Чем занимаешься?");

        user2.sendMessage(user1, "Привет!");
        user2.sendMessage(user1, "Делаю уроки.");
        user2.sendMessage(user1, "А ты что делаешь?");

        user3.sendMessage(user1, "Привет!");
        user3.sendMessage(user1, "Ты был сегодня в школе?");
        user3.sendMessage(user1, "Какие там были уроки?");

        user1.sendMessage(user3, "Привет!");
        user1.sendMessage(user3, "Да, был.");
        user1.sendMessage(user3, "Литература и Английский язык");

        user3.sendMessage(user1, "Понял, ладно пока!");

        MessageDatabase.showDialog(user1, user3);

    }
}
