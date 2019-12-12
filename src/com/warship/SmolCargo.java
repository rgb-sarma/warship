package com.warship;

public class SmolCargo extends Cargo {

    public SmolCargo() {
        super(100, 1000);
    }

    @Override
    public void addToFleet(CommandShip ship) {
        ship.addToFleet(this);
        System.out.println("Added to fleet!");
    }
}
