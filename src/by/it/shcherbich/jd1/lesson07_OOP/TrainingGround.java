package by.it.shcherbich.jd1.lesson07_OOP;
/*
Битва Лучника против Воина, Мага против Зомби
 */

public class TrainingGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Леголас", 150);
        Hero wizard = new Mage("Гендальф", 160);
        Enemy warrior = new Warrior("Азог осквернитель", 150);
        Enemy zombie = new Zombie("Саурон на минималках", 200);

        while (archer.isAlive() && warrior.isAlive()) {
            if (archer.isAlive())
                archer.attackEnemy(warrior);
            if (!warrior.isAlive()) {
                System.out.println("Воин убит");
                break;
            }
            warrior.attackHero(archer);
            if (archer.isAlive() == false) {
                System.out.println("Лучник убит");
                break;
            }
        }
        while (wizard.isAlive() && zombie.isAlive()) {
            wizard.attackEnemy(zombie);
            if (zombie.isAlive() == false) {
                System.out.println("Зомби убит");
                break;
            }
            zombie.attackHero(wizard);
            if (wizard.isAlive() == false) {
                System.out.println("Маг убит");
                break;
            }
        }
    }
}
