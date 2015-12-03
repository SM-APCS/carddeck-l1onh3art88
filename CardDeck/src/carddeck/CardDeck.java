/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;

/**
 *
 * @author Spencer
 */
public class CardDeck {

    /**
     * @param args the command line arguments
     */
        private static Card[] cards;
        int topCardIndex;
        public CardDeck(){
            cards = new Card[52];
            int numberOfCard=0; 
            for(int suit = 0; suit <= 3; suit++){
                for(int value = 1; value <= 13; value++){
                 cards[numberOfCard] = new Card(value, suit);
                 numberOfCard++;
                }
            };
        }
        public CardDeck shuffle(CardDeck deck){
            for(int i = 0; i<52; i++){
                int rand = (int)(Math.random()*(i+1));
                Card temp = deck.cards[i];
                deck.cards[i] = deck.cards[rand];
                deck.cards[rand] = temp;
            }
            return deck;
        }
        public void deal(){
            for(int i = 0; i< 52; i++){
            Card card = cards[i];
            System.out.println(card);
            }
        }
        
    
    
}
