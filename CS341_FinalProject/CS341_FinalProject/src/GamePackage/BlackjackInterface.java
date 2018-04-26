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
     * Hit
     *
     * @require
     * @ensure
     * @return
     *
     */
    public Card hit();

    /**
     * Get Sum
     *
     * @param hand 
     * @require
     * @ensure
     * @return
     *
     */
    public int getSum(List<Card> hand);

    /**
     * Check Bust
     *
     * @param hand
     * @require
     * @ensure
     * @return
     *
     */
    public boolean checkBust(List<Card> hand);

    /**
     * Check Winner
     *
     * @param playerHand 
     * @param houseHand
     * @require
     * @ensure
     * @return
     *
     */
    public int checkWinner(List<Card> playerHand, List<Card> houseHand);

}
