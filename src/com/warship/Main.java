package com.warship;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Thisg compiles");

        SmolShip smol = new SmolShip();
        BigShip bigChungus = new BigShip();
        CommandShip fleetComander = new CommandShip();
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
