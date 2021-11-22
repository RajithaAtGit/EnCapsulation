package com.gtrxone;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Gtrxone";
//        player.health = 20;
//        player.weapon = "AK-47";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Gtrxone",200,"AK-47");
        System.out.println("health=" + enhancedPlayer.getHealth());
    }
}
