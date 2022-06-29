package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {
    public static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    public static final int CARDS = 9;
    public static final int PLAYERS = 4;
    public static final String[][] playCard = new String[4][9];

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public static void distribute() {
        for (int i = 0; i < PLAYERS; i++) {
            for (int j = 0; j < CARDS; j++) {
                String s1 = getRandom(suit);
                String s2 = getRandom(rank);
                playCard[i][j] = s1.concat(s2);
            }
        }
    }

    public static void showCard() {
        for (int i = 0; i < PLAYERS; i++) {
            int player = i + 1;
            System.out.println("\nPlayer " + player + " cards: ");

            for (int j = 0; j < CARDS; j++) {
                    System.out.print(playCard[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        distribute();
        showCard();
    }
}
