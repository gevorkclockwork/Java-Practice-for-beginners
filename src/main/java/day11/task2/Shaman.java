package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
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
    public int healHimself() {
        return health += 50;
    }

    @Override
    public int healTeammate(Hero hero) {
        if (hero.health == 100) {
            return hero.health;
        } else if (hero.health < 100) {
            hero.health += 30;
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
