package GamePackage;

import MainPackage.Card;
import MainPackage.Deck;
import java.util.ArrayList;
import java.util.List;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Slapjack implements SlapjackInterface {

    Deck deck = new Deck();
    
         //   List<Card> temp = new ArrayList<Card>();
    

    public List<Card> generateHand(int Humanplayer, int ComputerPlayers) {
        List<Card> temp = new ArrayList<Card>();
        deck.shuffleDeck();
        int players = Humanplayer + ComputerPlayers;
             
        if (players == 2) {
            //temp.add(deck.);
             temp.add(deck.draw());
             temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            return temp;
        } else if (players == 3) {
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            return temp;

        } else if (players == 4) {
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());
            temp.add(deck.draw());

            return temp;
        }
            return temp;
    }

    public int getTotalCards(List<Card> hand) {

        int total = hand.size();

        return total;
    }
    
    public List<Card> draw() {
        List<Card> temp = new ArrayList<Card>();
        deck.shuffleDeck();
       

       
            temp.add(deck.draw());
        return temp;
    }
    
}
