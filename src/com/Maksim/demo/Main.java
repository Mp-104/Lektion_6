package com.Maksim.demo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instantiate
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

// Variabler, använd for loop för fler spelare
        String player1;
        String player2;
        int score;  // nested for loop för antal tärningar
        int rounds = 3;  // ersätt med scanner int input
        int sum = 0;
        int sum2 = 0;

        //Player1
        System.out.println("input player1 name: ");
        player1 = sc.nextLine();
        System.out.println("player 1 name is: "+ player1);

        //Player2
        System.out.println("input player2 name: ");
        player2 = sc.nextLine();
        System.out.println("player 2 name is: " + player2);

        //Dice


        // Random random = new Random();
        //int score = random.nextInt(1,6);
        //System.out.println(score);

        //for (int i = 0; i < 1000; i++) {}
           // score = random.nextInt(6)+1;
           // System.out.println(score);

        //player 1
        System.out.println("player1 is throwing" + player1);
        for (int i = 0; i < rounds; i++) {

            score = random.nextInt(6)+1;
            System.out.println("poäng: " + score);

            sum += score;
            System.out.println("samlad poäng" + sum);
        }

        // Player2
        System.out.println(player2 + " throwing");

        for (int i = 0; i < rounds; i++) {

            score = random.nextInt(6)+1;
            System.out.println("poäng: " + score);

            sum2 += score;
            System.out.println("samlad poäng" + sum2);
        }

    }


}
