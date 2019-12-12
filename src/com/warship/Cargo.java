package com.warship;

public abstract class Cargo extends Ship {

    private int capacity;

    public Cargo(int hp, int capacity) {
        super(hp);
        this.capacity = capacity;
    }

    public void addToFleet(CommandShip ship){
        ship.addToFleet(this);
        System.out.println("Added to fleet!");
    }
}
