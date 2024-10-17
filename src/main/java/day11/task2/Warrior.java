package day11.task2;

import day11.task1.Warehouse;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        physAtt = 30;
        physDef = 0.8;
    }

    @Override
    public int physicalAttack(Hero hero) {
        if (hero.health > 0) {
            if (hero.physDef > 0) {
                hero.health = (int) (hero.health - (physAtt - (physAtt * hero.physDef)));
                if (hero.health < 0) {
                    return hero.health = 0;
                } else {
                    return hero.health;
                }
            } else {
                hero.health = hero.health - physAtt;
                if (hero.health < 0) {
                    return hero.health = 0;
                } else {
                    return hero.health;
                }
            }
        } else {
            return hero.health = 0;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
