package by.it.shcherbich.jd1.lesson06;

import java.util.Random;

/*
Маг наносит 25ед. урона и дополнительно 15ед. урона Зомби
 */
public class Mage extends Hero {


    public Mage(String name, int health) {
        super(name, health);
    }

    void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + getName() + " атакует врага " + enemy.getName());
        enemy.takeDamage(25);
        if (enemy instanceof Zombie && enemy.isAlive()) {
            System.out.println("Маг " + getName() + " наносит зомби дополнительный удар " + enemy.getName());
            enemy.takeDamage(15);
        }
    }
}
