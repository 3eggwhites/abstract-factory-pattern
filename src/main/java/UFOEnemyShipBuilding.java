package main.java;

public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;
        EnemyShipPartsFactory shipPartsFactory = null;

        if(typeOfShip.equals("UFO")) {
            shipPartsFactory = new UFOEnemyShipPartsFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("Grunt UFO Ship");
        } else if (typeOfShip.equals("UFO BOSS")) {
            shipPartsFactory = new UFOBOSSEnemyShipPartsFactory();
            theEnemyShip = new UFOBOSSEnemyShip(shipPartsFactory);
            theEnemyShip.setName("Boss UFO Ship");
        }
        return theEnemyShip;
    }
}
