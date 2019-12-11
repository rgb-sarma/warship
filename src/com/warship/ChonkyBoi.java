package com.warship;

public class ChonkyBoi extends BattleShip {

    public ChonkyBoi() {
        super(500, 100);
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
