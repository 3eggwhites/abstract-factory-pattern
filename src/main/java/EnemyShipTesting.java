package main.java;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt);
        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss);
    }
}
