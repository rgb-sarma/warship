package com.warship;

import java.util.LinkedList;
import java.util.List;

public class BigChungus extends BattleShip {

    private List<Ship> fleet;

    private int shield;

    public BigChungus() {
        super(1000, 150);
        this.shield = 20;
        this.fleet = new LinkedList<Ship>();
    }

    public void addToFleet(Ship ship){
        this.fleet.add(ship);
    }

    @Override
    public void getDamage(int damage) {
        this.hp -= (damage - shield);
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
