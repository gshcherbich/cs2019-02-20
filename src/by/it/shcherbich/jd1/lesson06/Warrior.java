package by.it.shcherbich.jd1.lesson06;

/*
Воин наносит 30ед. урона и Лучнику дополнительный удар в 20ед. урона.
 */
public class Warrior extends Enemy {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    void attackHero(Hero hero) {
        System.out.println("Воин " + getName() + " атакует врага " + hero.getName());
        hero.takeDamage(30);
        if (hero instanceof Archer && hero.isAlive()) {
            System.out.println("Воин " + getName() + " наносит лучнику дополнительный удар " + hero.getName());
            hero.takeDamage(20);
        }
    }
}
