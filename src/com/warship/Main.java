package com.warship;

public class Main {

    public static void main(String[] args) {
	    System.out.println("This shit compiles");

	    SmolShip smol = new SmolShip();
	    ChonkyBoi bigChungus = new ChonkyBoi();
	    BigChungus fleetComander = new BigChungus();
	    BigCargo carGO = new BigCargo();

	    fleetComander.addToFleet(smol);

	    bigChungus.attack(smol);
        bigChungus.attack(fleetComander);
        bigChungus.attack(fleetComander);
        bigChungus.attack(carGO);

	    System.out.println(smol.getHp());
	    System.out.println(fleetComander.getHp());
	    System.out.println(carGO.getHp());

    }
}
