package com.Maksim.demo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* for (int i = 0; i < 5; i++) {
            System.out.println("index i: " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("index j " + j);

            }
        }*/

        Scanner scanner = new Scanner(System.in);

        int rounds = 5;

        System.out.println("hur många tärningar?");
        int dice = scanner.nextInt();
        System.out.println("you picked: " + dice);

        //rounds
        for (int i = 0; i < rounds; i++) {
            System.out.println("round: " + i);

            //dice
            for (int j = 0; j < dice; j++) {
                Random random = new Random ();

                int score = random.nextInt(6)+1;

                System.out.println("j is : " + j);

            }
        }


    }

}