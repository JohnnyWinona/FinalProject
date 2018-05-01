/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import MainPackage.Card;
import java.util.*;

public interface BlackjackInterface {

    /**
     * Generate Hand
     *
     * @require A valid blackjack deck is created and the player starts a game.
     * @ensure A blackjack deck is shuffled and two cards are drawn.
     * @return A list of two cards is returned for the hand.
     *
     */
    public List<Card> generateHand();

    /**
     * Hit
     *
     * @require A valid blackjack deck is created.
     * @ensure A blackjack deck is shuffled and the first card is drawn.
     * @return The top card is returned after the deck has been shuffled.
     *
     */
    public Card hit();

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
    public int getSum(List<Card> hand);

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
    public boolean checkBust(List<Card> hand);

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
    public int checkWinner(List<Card> playerHand, List<Card> houseHand);
}
