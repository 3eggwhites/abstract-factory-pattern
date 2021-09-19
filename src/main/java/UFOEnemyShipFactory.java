package main.java;

public class UFOEnemyShipFactory implements EnemyShipFactory{
    @Override
    public IESEngine addEngine() {
        return new ESEngine();
    }

    @Override
    public IESWeapon addGun() {
        return new ESGun();
    }
}
