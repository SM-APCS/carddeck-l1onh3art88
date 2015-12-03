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
public class Dealer {
    public static void main(String[] args) {
    CardDeck deck= new CardDeck();
    Card card = new Card(2,1);
    System.out.println(card);
    deck.shuffle(deck);
    deck.deal();
    System.out.println(deck);
    }
}
