package com.Maksim.demo;

import java.util.*;

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



        System.out.println("Välkommen till tärning! Hur många spelar? Ange ett heltal");
        while (!scanner.hasNextInt()) {                         // while loopen fortsätter köra scanner tills den får integer
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int players = scanner.nextInt();
        System.out.println(players + " Spelare");


        System.out.println(); // Radbrytning


        System.out.println("Hur många rundor? Ange ett heltal");
        while (!scanner.hasNextInt()) {
            System.out.println("Det är inte ett heltal!");
            scanner.next();
        }
        int rounds = scanner.nextInt();
        System.out.println(rounds + " Rundor");

        System.out.println(); // Radbrytning

        System.out.println("Hur många tärningar? Ange ett heltal!");
        while (!scanner.hasNextInt()) {
            System.out.println("Det är inte ett heltal");
            scanner.next();
        }
        int dices = scanner.nextInt();
        System.out.println(dices + " Tärningar");

        scanner.nextLine();   // player1.name = scanner.nextLine(); below was skipped, for some reason, this line prevents that and is skipped instead

        /*System.out.println("what is your name?");
        player1.name = scanner.nextLine();
        System.out.println("Your name is: " + player1.name); */

        System.out.println(); // Radbrytning


        for (int i = 0; i < players; i++) {

            //create Unique players
            System.out.println("Ange namn för spelare " + (i+1 )); // +1 to better represent amount of players
            Player player = new Player ();
            player.name = scanner.nextLine();

            System.out.println("Spelare " + (i+1) + ": " + player.name);
            playerlist.add(player);
            System.out.println(); // Radbrytning
            // System.out.println(player.score); //!!!!! TEST
            // System.out.println(playerlist);


            // System.out.println("Playerlist " + playerlist);

        }

        //System.out.println("playerlist: " + playerlist);  // skriver ut address och inte själva ArrayList !!! @Override toString


        System.out.println("Medverkande spelare: ");
        // System.out.println(playerlist);


        for (int i = 0; i < playerlist.size(); i++) {

            System.out.println(playerlist.get(i).name);

        }

        System.out.println(); // Radbrytning
        System.out.println("Tryck enter för att börja spelet");
        scanner.nextLine();
        System.out.println(); // radbrytning

        for (int i = 0; i < rounds; i++) {   // rounds är en variabel som spelare matar in med en int, loopen körs så många ggr
            System.out.println("Runda " + (i+1) );
            System.out.println("Tryck enter för att fortsätta");
            scanner.nextLine();

            for (int j = 0; j < playerlist.size(); j++) {
                System.out.println(playerlist.get(j).name + "'s tur");
                System.out.println("Tryck enter för att slå tärning");
                scanner.nextLine();


                for (int k = 0; k < dices; k++) {
                    int dice = random.nextInt(1,7);   // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! TEST
                    System.out.println("Tärning " + (k+1) + ": " + dice);

                    playerlist.get(j).score += dice;


                }
                System.out.println(playerlist.get(j).name + " har " + playerlist.get(j).score + " poäng!") ;
                System.out.println(); // Radbrytning



            }



        }
        // var temp = 0;

        /*for (int i = 0; i < playerlist.size(); i++) {
            System.out.println("playerlist.get(i).name: " + playerlist.get(i).name + " playerlist.get(i).score: " + playerlist.get(i).score);
            System.out.println(playerlist.get(i).score);
            System.out.println(playerlist); */


            /* for (int j = i+1 ; j < playerlist.size(); j++) {
                if (playerlist.get(i).score < playerlist.get(j).score); {
                    temp = playerlist.get(i).score;
                    playerlist.get(i).score = playerlist.get(j).score; // omfördelar score mellan spelaren, sorterar inte listan efter
                    playerlist.get(j).score = temp;


                }

            }

        } */
        System.out.println("Tryck enter för en sammanställning av resultatet");
        scanner.nextLine();

        System.out.println(); // Radbrytning
        System.out.println("Slutresultatet: ");

        // System.out.println("Before sorting? " + playerlist);
        Collections.sort(playerlist , Collections.reverseOrder());
        //System.out.println("After sorting? " + playerlist);

        for (int i = 0; i < playerlist.size(); i++) {
            System.out.println(playerlist.get(i).score + " poäng: " + playerlist.get(i).name);
        }
        if (playerlist.size() > 1) {
            if (playerlist.get(0).score == playerlist.get(1).score) {
                System.out.println(); // Radbrytning
                System.out.println("Det blev oavgjort");

            } else {
                System.out.println(); // Radbrytning
                System.out.println(playerlist.get(0).name + " Vann!");

            }
        }




        //Player winner = playerlist.get(0);
        /*for (Player player : playerlist) {
            System.out.println(player.name + " fick " + player.score + " poäng");
            if (player.score > winner.score) {
                winner = player;


            }
        } */
        //System.out.println("Du vann, " + winner.name + "!");






         //var temp = 0;
         /* for (int i = 0; i < playerlist.size(); i++) {
            System.out.println("playerlist.get(i).name: " + playerlist.get(i).name + " playerlist.get(i).score: " + playerlist.get(i).score);
            System.out.println(playerlist.get(i).score);
            System.out.println(playerlist);
            System.out.println(players);


            for (int j = i+1 ; j < playerlist.size(); j++) {
                if (playerlist.get(i).score < playerlist.get(j).score); {
                    temp = playerlist.get(i).score;
                    playerlist.get(i).score = playerlist.get(j).score; // omfördelar score mellan spelaren, sorterar inte listan efter
                    playerlist.get(j).score = temp;




                }
            }
        } */
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
/*Player winner = playerlist.get(0);
   for (Player player : playerlist) {
      if (player.getScore () > winner.getscore())  {
      winner = player

   } */
