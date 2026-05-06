package org.example;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("*********************************");

        Player player1 = new Player("Ali", 85, Weapon.SWORD);
        Player player2 = new Player("Veli", 95, Weapon.AXE);

        player1.loseHealth(35);
        player2.restoreHealth(15);
        player2.loseHealth(150);

        System.out.println(player1.healthRemaining());
        System.out.println(player2.healthRemaining());
    }
}