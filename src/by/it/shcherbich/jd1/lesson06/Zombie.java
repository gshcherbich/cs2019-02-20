package by.it.shcherbich.jd1.lesson06;

/*
Зомби наносит 10ед. урона и может переродиться 1 раз c 50ед. здоровья
 */
public class Zombie extends Enemy {
    private boolean reincartation = false;


    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    void attackHero(Hero hero) {
        System.out.println("Зомби " + getName() + " атакует врага " + hero.getName());
        hero.takeDamage(10);
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else {
            if (reincartation == false) {
                setHealth(50);
                System.out.println("Зомби " + getName() + " переродился с 50ед. здоровья");
                reincartation = true;
                return true;
            } else return false;
        }
    }
}

