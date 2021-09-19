package main.java;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        EnemyShipFactory shipFactory = null;

        if(typeOfShip.equals("UFO")) {
            shipFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipFactory);
            theEnemyShip.setName("Grunt UFO Ship");
        } else if (typeOfShip.equals("UFO BOSS")) {
            shipFactory = new UFOBOSSEnemyShipFactory();
            theEnemyShip = new UFOBOSSEnemyShip(shipFactory);
            theEnemyShip.setName("Boss UFO Ship");
        }
        return theEnemyShip;
    }
}
