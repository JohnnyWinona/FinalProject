/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package GamePackage;

import MainPackage.Card;
import java.util.List;

public interface MemoryMatchInterface {

    /**
     * Generate Memory Match
     *
     * @param difficulty The String value for the difficulty chosen for the
     * memory match game.
     * @require The user chooses the difficulty by clicking on the corresponding
     * button from the difficulty frame window.
     * @ensure A memory match game is generated with the chosen difficulty.
     *
     */
    public void generateMemoryMatch(String difficulty);

    /**
     * Get Cards
     *
     * @require The player starts a new game with a valid difficulty.
     * @ensure A list of usable cards is created based on the corresponding
     * difficulty.
     * @return A list of cards and their matches are returned in order for the
     * player to have valid cards to select within the game.
     *
     */
    public List<Card> getCards();

    /**
     * Is Match
     *
     * @param cardOne The first card object that is selected and used to check
     * for a match.
     * @param cardTwo The second card object that is selected and used to check
     * for a match.
     * @require Two card objects are chosen with intention on checking to see if
     * both cards have the same suit and value properties.
     * @ensure A truth value is chosen based on whether or not the two cards
     * have matching suit and value properties.
     * @return The boolean value is returned which expresses if the two cards
     * match.
     *
     */
    public boolean isMatch(Card cardOne, Card cardTwo);

}
