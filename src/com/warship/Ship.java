package com.warship;

public abstract class Ship {

    //hp
    public int hp;

    //speed
    private int speed;

    //constructorr
    public Ship(int hp) {
        this.hp = hp;
        this.speed = 100;
    }

    public int getHp(){
        return this.hp;
    }

    //metoda getDamage
    public void getDamage(int damage){
        if(this.hp <= 0){
            System.out.println("Brod je unisten");
            return;
        } else this.hp -= damage;
    }
}
