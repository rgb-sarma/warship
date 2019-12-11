package com.warship;

public class SmolShip extends BattleShip {
    public SmolShip() {
        super(300, 50);
    }

    @Override
    public void attack(Ship ship) {
        ship.getDamage(this.damage);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }
}
