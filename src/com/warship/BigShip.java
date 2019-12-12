package com.warship;

public class BigShip extends BattleShip {

    public BigShip() {
        super(500, 100);
    }

    @Override
    public void addToFleet(CommandShip ship) {
        ship.addToFleet(this);
        System.out.println("Added to fleet!");
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
