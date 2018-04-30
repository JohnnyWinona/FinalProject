
/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;

public interface SlapjackInterface {

    /**
     * Generate Hand
     * 
     * @param Humanplayer integer number of human players
     * @param ComputerPlayers integer number of computer players
     * @require A valid number of players
     * @ensure The hand will be added to the list
     * @return Returns a list of cards based on the number of players
     */
    public List<Card> generateHand(int Humanplayer, int ComputerPlayers);

    /**
     * Get Total Cards
     * 
     * @param hand The hand list
     * @require A valid List object
     * @ensure All of the cards get counted
     * @return Returns an int value of all of the cards in the hand
     */
    public int getTotalCards(List<Card> hand);

    /**
     * Draw
     * 
     * @require A valid List is added to inventory
     * @ensure The List is empty
     * @return The list of cards to be drawn
     */
    public List<Card> draw();
}
