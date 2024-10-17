package day11.task2;

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        System.out.println("1. Воин атакует Паладина");
        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        System.out.println();

        System.out.println("2. Паладин атакует Мага");
        paladin.physicalAttack(magician);
        System.out.println(magician.toString());
        System.out.println();

        System.out.println("3. Шаман лечит Мага");
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        System.out.println();

        System.out.println("4. Маг атакует Паладина, тип атаки М");
        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());
        System.out.println();

        System.out.println("5. Шаман атакует Воина, тип атаки Ф");
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        System.out.println();

        System.out.println("6. Паладин лечит себя");
        paladin.healHimself();
        System.out.println(paladin.toString());
        System.out.println();

        System.out.println("7. Воин атакует Мага 5 раз");
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }


    }
}
