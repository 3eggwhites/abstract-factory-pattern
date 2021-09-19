package main.java;

public class UFOBOSSEnemyShipPartsFactory implements EnemyShipPartsFactory {
    @Override
    public IESEngine addEngine() {
        return new ESBossEngine();
    }

    @Override
    public IESWeapon addGun() {
        return new ESBossGun();
    }
}
