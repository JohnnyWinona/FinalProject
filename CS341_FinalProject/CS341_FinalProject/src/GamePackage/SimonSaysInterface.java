/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import java.util.List;

public interface SimonSaysInterface {

    /**
     * Add Order
     *
     * @require
     * @ensure
     *
     */
    public void addOrder();

    /**
     * Size
     *
     * @require A list of steps for the user to follow has been created.
     * @ensure The list of steps are counted.
     * @return The int value of how many steps are required for the player to
     * follow.
     *
     */
    public int size();

    /**
     * Is Match
     *
     * @param inputOrder The list of steps entered by the player is passed.
     * @require A list of the players input is created, as well as the list of
     * required steps for the player to follow is created.
     * @ensure Check the two lists (player input and required steps) to
     * determine if the player entered all the correct steps.
     * @return A truth value is returned based on whether or not the player
     * successfully followed the order of steps.
     *
     */
    public boolean isMatch(List<Integer> inputOrder);

    /**
     * Play
     *
     * @require
     * @ensure
     * @return A list including the first step for the player to follow is returned.
     *
     */
    public List<Integer> play();

}
