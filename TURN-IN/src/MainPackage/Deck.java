/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.ImageIcon;

public class Deck {

    public Queue<Card> deckOfCards = new LinkedList<>();

    /**
     * Make Deck
     *
     * @param deckOfCards The deck of cards that will be used.
     * @require A valid deckOfCards object is instantiated.
     * @ensure The deckOfCards is to be filled with 52 valid and non-repeating
     * cards.
     * @return Returns a queue that acts as a deck of cards.
     */
    public Queue<Card> makeDeck(Queue<Card> deckOfCards) {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                deckOfCards.add(new Card(value, suit, null));
            }
        }
        for (int i = 0; i < deckOfCards.size(); i++) {
            Card temp = deckOfCards.remove();
            String temp2 = "/cards/" + temp.toString() + ".jpg";
            ImageIcon image;
            image = new ImageIcon(getClass().getResource(temp2));
            temp.setCardImage(image);
            deckOfCards.add(temp);
        }
        return deckOfCards;
    }

    public Deck() {
        deckOfCards = makeDeck(deckOfCards);
    }

    /**
     * Get Deck of Cards
     *
     * @require A valid deck of cards is created.
     * @ensure All 52 cards will be retrieved.
     * @return Returns a queue that acts as a deck of cards.
     */
    public Queue<Card> getDeckOfCards() {
        return deckOfCards;
    }

    /**
     * Set Deck of Cards
     *
     * @param deckOfCards The deck of cards that will be used.
     * @require Reasonable need for the deck of cards to be set, such as when
     * shuffling.
     * @ensure The deck of cards is set and updated to reflect any changes.
     */
    public void setDeckOfCards(Queue<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    /**
     * To String
     *
     * @require A valid deck of cards is created.
     * @ensure The deck of cards is retrieved.
     * @return Returns a String of what's in the queue (deck of cards).
     */
    @Override
    public String toString() {
        return "Deck of cards: " + deckOfCards;
    }

    /**
     * Shuffle Deck
     *
     * @require A valid deck of cards is created.
     * @ensure All cards in the deck will be shuffled and reorganized randomly.
     */
    public void shuffleDeck() {
        Collections.shuffle((List<Card>) deckOfCards);
    }

    /**
     * Move To Bottom
     *
     * @param newBottom The card to be moved to the bottom.
     * @require A valid deck of cards is created and a card is to be reused.
     * @ensure The used card is passed to the bottom of the deck.
     */
    public void moveToBottom(Card newBottom) {
        deckOfCards.add(newBottom);
    }

    /**
     * Draw
     *
     * @require A valid deck of cards is created.
     * @ensure The first card of the deck is to be retrieved.
     * @return Returns the card that was on the top of the deck of cards.
     */
    public Card draw() {
        return deckOfCards.remove();
    }
}
