package by.it.shcherbich.jd1.lesson06;
/*
Битва Лучника против Воина и Зомби
 */
public class BattleGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Леголас", 250);
        Enemy enemy[] = {new Warrior("Азог осквернитель", 150), new Zombie("Саурон на минималках", 200)};
        int i = 0;
        while (i < enemy.length && archer.isAlive()) {
            archer.attackEnemy(enemy[i]);
            if (!enemy[i].isAlive()) {
                System.out.println(enemy[i].getName() + " убит.");
                if (i==enemy.length-1){ break;}
                else {i++;}
            }
            if (enemy[i].isAlive()) {
                enemy[i].attackHero(archer);
                if (!archer.isAlive()) {
                    System.out.println("Лучник " + archer.getName() + " убит.");
                    break;
                }
            }
        }
    }
}
