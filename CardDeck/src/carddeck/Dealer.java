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
import java.util.Scanner;
public class Dealer {
    public static void main(String[] args) {
    CardDeck deck= new CardDeck();
    Scanner scan = new Scanner(System.in);
    System.out.println("How many cards do you want to be dealt?");
    int numberCardsDealt = scan.nextInt();
    
    deck.shuffle(deck);
    deck.deal(numberCardsDealt);
    deck.countCards();
    }
}
