package com.Maksim.demo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // amount of players
        // amount of rounds
        // amount of dices

        // instantiate
        Player player1 = new Player();
        Scanner scanner = new Scanner(System.in);


        //Variables
        ArrayList<Player> playerlist = new ArrayList<>();


        System.out.println("what is your name?");
        player1.name = scanner.nextLine();
        System.out.println("Your name is: " + player1.name);


        for (int i = 0; i < 5; i++) {   // ersätt i < 5 med user input som efterfrågar antal spelare.

            //create Unique players
            Player player = new Player ();
            player.name = "player " + scanner.nextLine();  // ersätt i med scanner för att få unikt namn scanner.nextLine()

            System.out.println(player.name);
            playerlist.add(player);

        }

        System.out.println("playerlist: " + playerlist);  // skriver ut address och inte själva ArrayList !!!

        System.out.println("fetching each player name");
        for (int i = 0; i < playerlist.size(); i++) {

            System.out.println(playerlist.get(i).name);

        }


    }

}