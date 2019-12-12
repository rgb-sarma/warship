package com.warship;

public abstract class BattleShip extends Ship {

    //damage
    public int damage;

    //constructor
    public BattleShip(int hp, int damage) {
        super(hp);
        this.damage = damage;
    }

    //attack(ship Ship) method
    public void attack(Ship ship){
        ship.getDamage(this.damage);
    }

    //add to fleet method
    public void addToFleet(CommandShip ship){

    }

}
