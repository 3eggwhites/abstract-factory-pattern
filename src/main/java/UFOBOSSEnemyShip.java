package main.java;

public class UFOBOSSEnemyShip extends EnemyShip{

    EnemyShipFactory shipFactory;

    public UFOBOSSEnemyShip(EnemyShipFactory factory) {
        this.shipFactory = factory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+ getName());

        weapon = shipFactory.addGun();
        engine = shipFactory.addEngine();
    }
}
