package main.java;

public class UFOEnemyShip extends EnemyShip{

    EnemyShipPartsFactory shipPartsFactory;

    public UFOEnemyShip(EnemyShipPartsFactory factory) {
        this.shipPartsFactory = factory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+ getName());

        weapon = shipPartsFactory.addGun();
        engine = shipPartsFactory.addEngine();
    }
}
