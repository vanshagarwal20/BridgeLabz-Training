package string;

import java.util.*;

public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                          "Jack", "Queen", "King", "Ace"};
        System.out.print("Enter number of players: ");
        int playersCount = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, playersCount, cardsPerPlayer);
        printPlayersCards(players);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int playersCount, int cardsPerPlayer) {
        if (playersCount * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }
        String[][] players = new String[playersCount][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < playersCount; j++) {
                players[j][i] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

}
