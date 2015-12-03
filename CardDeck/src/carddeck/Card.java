/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;

/**
 *
 * @author spenc_000
 */
public class Card {
    private final int suit; // 0, 1, 2, 3 represent Spades, Hearts, Clubs,
                            // Diamonds, respectively

    private final int value; // 1 through 13 (1 is Ace, 11 is jack, 12 is
                                // queen, 13 is king)

    /*
     * Strings for use in toString method and also for identifying card images
     */
        private static String[] suitNames = { "Spades", "Hearts", "Clovers", "Diamonds" };
        private static String[] valueNames = { "Unused", "A", "2", "3", "4",
            "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        public Card(int value, int suit){
            this.suit = suit;
            this.value =value;
        }
        public int getValue(){
            return value;
        }
        public int getSuit(){
            return suit;
        }
        public String toString(){
            return valueNames[value] + " of " + suitNames[suit];
        }
}
