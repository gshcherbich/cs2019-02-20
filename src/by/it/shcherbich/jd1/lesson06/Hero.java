package by.it.shcherbich.jd1.lesson06;


public abstract class Hero implements Mortal {
    String name;
    int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attackEnemy(Enemy enemy);

    void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(getName() + " получил " + damage + "ед. уровна. Осталось " + getHealth() + "ед. здоровья");
    }

    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else return false;
    }
}