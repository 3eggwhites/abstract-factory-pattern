package main.java;

public class UFOBOSSEnemyShipFactory implements EnemyShipFactory{
    @Override
    public IESEngine addEngine() {
        return new ESBossEngine();
    }

    @Override
    public IESWeapon addGun() {
        return new ESBossGun();
    }
}
