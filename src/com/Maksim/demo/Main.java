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
        Random random = new Random();


        //Variables
        ArrayList<Player> playerlist = new ArrayList<>();

        System.out.println("how many players?");
        int players = scanner.nextInt();
        System.out.println(players + " players");

        System.out.println("how many rounds?");
        int rounds = scanner.nextInt();
        System.out.println(rounds + " rounds");

        System.out.println("how many dices");
        int dices = scanner.nextInt();
        System.out.println(dices + " dices");

        scanner.nextLine();   // player1.name = scanner.nextLine(); below was skipped, for some reason, this line prevents that and is skipped instead

        System.out.println("what is your name?");
        player1.name = scanner.nextLine();
        System.out.println("Your name is: " + player1.name);


        for (int i = 0; i < players; i++) {   // ersätt i < 5 med user input som efterfrågar antal spelare.

            //create Unique players
            System.out.println("Input player " + (i+1 )+ " name"); // +1 to better represent amount of players
            Player player = new Player ();
            player.name = "player "+ (i+1)+" " + scanner.nextLine();  // i+1 so it doesn't start at 0, more humanely represents amount of players

            System.out.println(player.name);
            playerlist.add(player);

        }

        System.out.println("playerlist: " + playerlist);  // skriver ut address och inte själva ArrayList !!!

        System.out.println("fetching each player name");
        for (int i = 0; i < playerlist.size(); i++) {

            System.out.println(playerlist.get(i).name);

        }

        for (int i = 0; i < rounds; i++) {
            System.out.println("round " + (i+1) );

            for (int j = 0; j < playerlist.size(); j++) {
                System.out.println(playerlist.get(j).name);


                for (int k = 0; k < dices; k++) {
                    int dice = random.nextInt(1,6);  // får aldrig mer än 5.. öka bound till 7 ?
                    System.out.println("dice " + (k+1) + " " + dice);

                    playerlist.get(j).score += dice;
                    System.out.println(playerlist.get(j).name + " " + playerlist.get(j).score);

                }



            }



        }

        for (int i = 0; i < playerlist.size(); i++) {
            System.out.println(playerlist.get(i).name);
            System.out.println(playerlist.get(i).score);

        }


    }

}