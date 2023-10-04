package com.Maksim.demo;

public class Player implements Comparable <Player>{  // implements Comparable interface to sort score
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    String name;
    int score;

    @Override                           // Logic of comparing and sorting after score
    public int compareTo(Player o) {
        return score - o.score;
    }
}

