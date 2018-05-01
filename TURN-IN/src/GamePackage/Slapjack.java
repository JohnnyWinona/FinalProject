/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import MainPackage.Card;
import MainPackage.Deck;
import java.util.ArrayList;
import java.util.List;

public class Slapjack implements SlapjackInterface {

    Deck deck = new Deck();

    //   List<Card> temp = new ArrayList<Card>();
    /**
     * Generate Hand
     *
     * @param Humanplayer integer number of human players
     * @param ComputerPlayers integer number of computer players
     * @require A valid number of players
     * @ensure The hand will be added to the list
     * @return Returns a list of cards based on the number of players
     */
    @Override
    public List<Card> generateHand(int Humanplayer, int ComputerPlayers) {
        List<Card> temp = new ArrayList<>();
        deck.shuffleDeck();
        int players = Humanplayer + ComputerPlayers;

        switch (players) {
            case 2:
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
            case 3:
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
            case 4:
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
            default:
                break;
        }
        return temp;
    }

    /**
     * Get Total Cards
     *
     * @param hand The hand list
     * @require A valid List object
     * @ensure All of the cards get counted
     * @return Returns an int value of all of the cards in the hand
     */
    @Override
    public int getTotalCards(List<Card> hand) {

        int total = hand.size();

        return total;
    }

    /**
     * Draw
     *
     * @require A valid List is added to inventory
     * @ensure The List is empty
     * @return The list of cards to be drawn
     */
    @Override
    public List<Card> draw() {
        List<Card> temp = new ArrayList<>();
        deck.shuffleDeck();

        temp.add(deck.draw());
        return temp;
    }
}
