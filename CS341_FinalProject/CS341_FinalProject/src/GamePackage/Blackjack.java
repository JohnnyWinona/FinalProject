/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import MainPackage.Deck;
import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;

public class Blackjack implements BlackjackInterface {

    public static final int BUST_VALUE = 21;

    Deck bjDeck = new Deck();

    /**
     * Generate Hand
     *
     * @require A valid blackjack deck is created and the player starts a game.
     * @ensure A blackjack deck is shuffled and two cards are drawn.
     * @return A list of two cards is returned for the hand.
     *
     */
    public List<Card> generateHand() {
        List<Card> temp = new ArrayList<Card>();
        bjDeck.shuffleDeck();
        temp.add(bjDeck.draw());
        temp.add(bjDeck.draw());
        return temp;
    }

    /**
     * Hit
     *
     * @require A valid blackjack deck is created.
     * @ensure A blackjack deck is shuffled and the first card is drawn.
     * @return The top card is returned after the deck has been shuffled.
     *
     */
    @Override
    public Card hit() {
        bjDeck.shuffleDeck();
        return bjDeck.draw();
    }

    /**
     * Get Sum
     *
     * @param hand The list of cards for an individual player.
     * @require Dealing, hitting, and checking winner will all lead to getting
     * the sum to help determine the winner.
     * @ensure The card values of an individual hand is summed together.
     * @return The int value of the total sum of cards in the hand.
     *
     */
    @Override
    public int getSum(List<Card> hand) {

        int sum = 0;

        for (int x = 0; x < hand.size(); x++) {
            sum += hand.get(x).getNumericalValue();
        }

        if (sum > 21) {
            for (int i = 0; i < hand.size(); i++) {
                if (hand.get(i).getValue().compareTo(Card.Value.ACE) == 0) {
                    sum -= 10;
                    break;
                }
            }
        }

        return sum;
    }

    /**
     * Check Bust
     *
     * @param hand The list of cards for an individual player.
     * @require Dealing, hitting, and checking winner will all lead to getting
     * the truth value of checking if busted in order to help determine the
     * winner.
     * @ensure The card values of an individual hand is summed together, and if
     * greater than 21, return true, else return false.
     * @return Whether or not the player's hand has busted (sum over 21).
     *
     */
    @Override
    public boolean checkBust(List<Card> hand) {

        if (getSum(hand) > BUST_VALUE) {
            return true;
        }

        return false;
    }

    /**
     * Check Winner
     *
     * @param playerHand The user-controlled player hand.
     * @param houseHand The house hand.
     * @require All user-controlled players to be standing or busted.
     * @ensure Determines whether each player wins against the house.
     * @return The int value based on win, lose, or tie.
     *
     */
    @Override
    public int checkWinner(List<Card> playerHand, List<Card> houseHand) {
        if (getSum(playerHand) > 21) {
            if (getSum(houseHand) > 21) {
                return 0;
            } else {
                return -1;
            }
        } else if (getSum(houseHand) > 21) {
            if (getSum(playerHand) > 21) {
                return 0;
            } else {
                return 1;
            }
        } else if (getSum(playerHand) == getSum(houseHand)) {
            return 0;
        } else {
            if (getSum(playerHand) > getSum(houseHand)) {
                return 1;
            } else if (getSum(playerHand) < getSum(houseHand)) {
                return -1;
            }
        }
        return 2;
    }

}
