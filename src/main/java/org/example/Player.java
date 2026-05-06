package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.max(0, Math.min(100, healthPercentage));
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        int healthRemain = healthPercentage - damage;
        if(healthRemain <= 0) System.out.println(name + " has been knocked out of game");
        healthPercentage = Math.max(0, healthRemain);
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        this.healthPercentage = Math.min(100, this.healthPercentage);
    }
}
