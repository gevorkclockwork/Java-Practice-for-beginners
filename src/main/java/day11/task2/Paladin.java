package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
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
    public int healHimself() {
        return health += 25;
    }

    @Override
    public int healTeammate(Hero hero) {
        if (hero.health == 100) {
            return hero.health;
        } else if (hero.health < 100) {
            hero.health += 10;
            if (hero.health > 100) {
                hero.health = 100;
            }
        } else {
            hero.health = 100;
        }
        return hero.health;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
