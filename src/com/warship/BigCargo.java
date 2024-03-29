package com.warship;

public class BigCargo extends Cargo {

    private int shield = 10;

    public BigCargo() {
        super(200, 5000);
        this.shield = shield;
    }

    @Override
    public void addToFleet(CommandShip ship) {
        ship.addToFleet(this);
        System.out.println("Added to fleet!");
    }

    @Override
    public void getDamage(int damage) {
        this.hp -= (damage - shield);
    }
}
