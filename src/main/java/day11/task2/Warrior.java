package day11.task2;

import day11.task1.Warehouse;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
