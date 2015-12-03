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
        
        private int num_cards = 52;
        public CardDeck(){
            
            cards = new Card[num_cards];
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
        public void deal(int cardsDealt){
            if (num_cards > 0){
                for(int i = 0; i <= cardsDealt; i++){
                Card card = cards[i];
                System.out.println(card);
                num_cards--;
                }
                
            }
            else{
                System.out.println("There are no more cards");
            }
        };
        public void countCards(){
            System.out.println("There are " + num_cards + " cards remaining.");
        };
    }
        
    
    

