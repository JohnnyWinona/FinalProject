/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimonSays implements SimonSaysInterface {

    List<Integer> order = new ArrayList<>();

    /**
     * Add Order
     *
     * @require A valid list for steps is created.
     * @ensure A step for the user to follow is added to the list.
     *
     */
    @Override
    public void addOrder() {
        Random rand = new Random();

        int n = rand.nextInt(3);
        order.add(order.size(), n);
    }

    /**
     * Size
     *
     * @require A list of steps for the user to follow has been created.
     * @ensure The list of steps are counted.
     * @return The int value of how many steps are required for the player to
     * follow.
     *
     */
    @Override
    public int size() {
        return order.size();
    }

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
    @Override
    public boolean isMatch(List<Integer> inputOrder) {
        return inputOrder.equals(order);
    }

    /**
     * Play
     *
     * @require A valid list for steps is created.
     * @ensure The list of steps is able to be returned.
     * @return A list including the first step for the player to follow is
     * returned.
     *
     */
    @Override
    public List<Integer> play() {
        return order;
    }
}
