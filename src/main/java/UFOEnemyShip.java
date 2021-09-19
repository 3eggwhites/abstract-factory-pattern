package main.java;

public class UFOEnemyShip extends EnemyShip{

    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory factory) {
        this.shipFactory = factory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+ getName());

        weapon = shipFactory.addGun();
        engine = shipFactory.addEngine();
    }
}
