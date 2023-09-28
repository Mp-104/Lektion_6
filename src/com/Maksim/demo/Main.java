package com.Maksim.demo;

import java.util.ArrayList;
import java.util.Arrays;
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



        System.out.println("Welcome to dice! How many players? Insert number");
        while (!scanner.hasNextInt()) {                         // while loopen fortsätter köra scanner tills den får integer
            System.out.println("That's not a number!");
            scanner.next();
        }
        int players = scanner.nextInt();
        System.out.println(players + " Players");


        System.out.println("How many rounds? Insert number");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        int rounds = scanner.nextInt();
        System.out.println(rounds + " Rounds");


        System.out.println("How many dices");
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        int dices = scanner.nextInt();
        System.out.println(dices + " Dices");

        scanner.nextLine();   // player1.name = scanner.nextLine(); below was skipped, for some reason, this line prevents that and is skipped instead

        System.out.println("what is your name?");
        player1.name = scanner.nextLine();
        System.out.println("Your name is: " + player1.name);


        for (int i = 0; i < players; i++) {   // ersätt i < 5 med user input som efterfrågar antal spelare.

            //create Unique players
            System.out.println("Input player " + (i+1 )+ " name"); // +1 to better represent amount of players
            Player player = new Player ();
            player.name = /*"player "+ (i+1)+": "*/ scanner.nextLine();  // i+1 so it doesn't start at 0, more humanely represents amount of players

            System.out.println("Player " + (i+1) + ": " + player.name);
            playerlist.add(player);

            System.out.println("Playerlist " + playerlist);

        }

        System.out.println("playerlist: " + playerlist);  // skriver ut address och inte själva ArrayList !!! @Override toString


        System.out.println("Participating players: ");
        for (int i = 0; i < playerlist.size(); i++) {

            System.out.println(playerlist.get(i).name);

        }

        for (int i = 0; i < rounds; i++) {
            System.out.println("round " + (i+1) );

            for (int j = 0; j < playerlist.size(); j++) {
                System.out.println(playerlist.get(j).name + "'s turn");


                for (int k = 0; k < dices; k++) {
                    int dice = random.nextInt(1,7);  // får aldrig mer än 5.. öka bound till 7 ?
                    System.out.println("Dice " + (k+1) + ": " + dice);

                    playerlist.get(j).score += dice;


                }
                System.out.println(playerlist.get(j).name + " has " + playerlist.get(j).score + " points!") ;



            }



        }
        int temp = 0;

        for (int i = 0; i < playerlist.size(); i++) {
            System.out.println("playerlist.get(i).name: " + playerlist.get(i).name + "playerlist.get(i).score" + playerlist.get(i).score);
            System.out.println(playerlist.get(i).score);
            System.out.println(playerlist);

            /*for (int j = i+1 ; j < playerlist.size(); j++) {
                if (playerlist.get(i).score > playerlist.get(j).score); {
                    temp = playerlist.get(i).score;
                    playerlist.get(i).score = playerlist.get(j).score;
                    playerlist.get(j).score = temp;


                }

            } */



        }


    }

}
/* Python code for sorting numbers, port to java

arr = [5,1,7]
temp = 0

for i in range(0, len(arr)):
    for j in range(i+1, len(arr)):
        if(arr[i] > arr[j]):
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
print(arr)

 */