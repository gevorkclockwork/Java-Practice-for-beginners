package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    static final int HEAL_AMOUNT = 25;
    static final int HEAL_TEAMMATE_AMOUNT = 25;


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
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }
        return health;
    }

    @Override
    public int healTeammate(Hero hero) {
        if (hero.health == MAX_HEALTH) {
            return hero.health;
        } else if (hero.health < MAX_HEALTH) {
            hero.health += HEAL_TEAMMATE_AMOUNT;
            if (hero.health > MAX_HEALTH) {
                hero.health = MAX_HEALTH;
            }
        } else {
            hero.health = MAX_HEALTH;
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
