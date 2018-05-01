/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

import java.util.Queue;

public interface DeckInterface {

    /**
     * Make Deck
     *
     * @param deckOfCards The deck of cards that will be used.
     * @require A valid deckOfCards object is instantiated.
     * @ensure The deckOfCards is to be filled with 52 valid and non-repeating
     * cards.
     * @return Returns a queue that acts as a deck of cards.
     */
    public Queue<Card> makeDeck(Queue<Card> deckOfCards);

    /**
     * Get Deck of Cards
     *
     * @require A valid deck of cards is created.
     * @ensure All 52 cards will be retrieved.
     * @return Returns a queue that acts as a deck of cards.
     */
    public Queue<Card> getDeckOfCards();

    /**
     * Set Deck of Cards
     *
     * @param deckOfCards The deck of cards that will be used.
     * @require Reasonable need for the deck of cards to be set, such as when
     * shuffling.
     * @ensure The deck of cards is set and updated to reflect any changes.
     */
    public void setDeckOfCards(Queue<Card> deckOfCards);

    /**
     * To String
     *
     * @require A valid deck of cards is created.
     * @ensure The deck of cards is retrieved.
     * @return Returns a String of what's in the queue (deck of cards).
     */
    @Override
    public String toString();

    /**
     * Shuffle Deck
     *
     * @require A valid deck of cards is created.
     * @ensure All cards in the deck will be shuffled and reorganized randomly.
     */
    public void shuffleDeck();

    /**
     * Move To Bottom
     *
     * @param newBottom The card to be moved to the bottom.
     * @require A valid deck of cards is created and a card is to be reused.
     * @ensure The used card is passed to the bottom of the deck.
     */
    public void moveToBottom(Card newBottom);

    /**
     * Draw
     *
     * @require A valid deck of cards is created.
     * @ensure The first card of the deck is to be retrieved.
     * @return Returns the card that was on the top of the deck of cards.
     */
    public Card draw();

}
