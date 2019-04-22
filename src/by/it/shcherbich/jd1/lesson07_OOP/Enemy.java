package by.it.shcherbich.jd1.lesson07_OOP;

public abstract class Enemy implements Mortal {
    String name;
    int health;

    public Enemy(String name, int health) {
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

    abstract void attackHero(Hero hero);

    void takeDamage(int damage) {
        this.health -= damage;
        if (getHealth()<0){
            System.out.println(getName() + " получил " + damage + "ед. уровна. Осталось 0ед. здоровья");
        }
        else {
            System.out.println(getName() + " получил " + damage + "ед. уровна. Осталось " + getHealth() + "ед. здоровья");
        }
    }

    public boolean isAlive() {
        return health>0;
    }
}
