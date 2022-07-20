package main.java;

public abstract class EnemyShip {

    private String name;
    IESWeapon weapon;
    IESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeShip();

    public void followHeroShip() {
        System.out.println(getName() + " following the HeroShip at " + engine);
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + weapon);
    }

    public String toString() {
        String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
        return infoOnShip;
    }
}
