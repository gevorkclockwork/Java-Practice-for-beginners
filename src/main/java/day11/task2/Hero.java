package day11.task2;

public abstract class Hero {

    static final int MAX_HEALTH = 100;

    int health = 100;
    double physDef = 0;
    double magicDef = 0;
    int physAtt = 0;
    int magicAtt = 0;

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


}
