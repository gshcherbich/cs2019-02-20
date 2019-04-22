package by.it.shcherbich.jd1.lesson07_OOP;

import java.util.Random;

/*
Лучник наносит 20ед. урона и может уворачиваться от атаки
 */
public class Archer extends Hero {


    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    void takeDamage(int damage) {
        Random rnd = new Random();
        int i = rnd.nextInt(2);
        if (i == 0) {
            this.health -= damage;
            System.out.println("Лучнику " + getName() + " нанесено " + damage + "ед. уровна. Осталось " + getHealth() + "ед. здоровья");
        } else {
            System.out.println("Лучник " + getName() + " увернулся");
        }
    }

    void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + getName() + " атакует врага " + enemy.getName());
        enemy.takeDamage(20);
    }
}
