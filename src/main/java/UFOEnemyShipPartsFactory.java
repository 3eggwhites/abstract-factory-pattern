package main.java;

public class UFOEnemyShipPartsFactory implements EnemyShipPartsFactory {
    @Override
    public IESEngine addEngine() {
        return new ESEngine();
    }

    @Override
    public IESWeapon addGun() {
        return new ESGun();
    }
}
