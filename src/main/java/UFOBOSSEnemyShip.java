package main.java;

public class UFOBOSSEnemyShip extends EnemyShip{

    EnemyShipPartsFactory shipPartsFactory;

    public UFOBOSSEnemyShip(EnemyShipPartsFactory factory) {
        this.shipPartsFactory = factory;
    }

    @Override
    void makeShip() {
        System.out.println("Making enemy ship "+ getName());

        weapon = shipPartsFactory.addGun();
        engine = shipPartsFactory.addEngine();
    }
}
