package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
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
    public int magicalAttack(Hero hero) {
        if (hero.health > 0) {
            if (hero.magicDef > 0) {
                hero.health = (int) (hero.health - (magicAtt - (magicAtt * hero.magicDef)));
                if (hero.health < 0) {
                    return hero.health = 0;
                } else {
                    return hero.health;
                }
            } else {
                hero.health = hero.health - magicAtt;
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
