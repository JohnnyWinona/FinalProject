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
     * @require
     * @ensure
     * @return
     *
     */
    public int size();

    /**
     * Is Match
     *
     * @param inputOrder
     * @require
     * @ensure
     * @return
     *
     */
    public boolean isMatch(List<Integer> inputOrder);

    /**
     * Play
     *
     * @require
     * @ensure
     * @return
     *
     */
    public List<Integer> play();

}
