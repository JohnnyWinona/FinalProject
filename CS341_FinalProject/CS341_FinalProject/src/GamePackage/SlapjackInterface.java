
import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;




/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public interface SlapjackInterface {

    /**
     * @param Humanplayer integer
     * @param ComputerPlayers integer
     *
     * @require A valid number of players
     *
     * @ensure The hand will be added to the list
     */
    
    public List<Card> generateHand(int Humanplayer, int ComputerPlayers); 
       
    /**
     * @param list The hand list
     * 
     *
     * @require A valid List object
     *
     * @ensure The all of the cards get counted
     */
    
    public int getTotalCards(List<Card> hand);
    
    /**
     * @param none
     * 
     * @require A valid List is added to inventory
     *
     * @ensure The List is empty
     */
    
    public List<Card> draw();
}
