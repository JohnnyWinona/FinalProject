/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

import javax.swing.Icon;

public class Card {

    //enums
    public static enum Suit {
        HEARTS, SPADES, DIAMONDS, CLUBS;
    }

    public static enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    //data members
    private final Value value;
    private final Suit suit;
    private Icon cardImage;

    public Card(Value value, Suit suit, Icon cardImage) {
        this.value = value;
        this.suit = suit;
        this.cardImage = cardImage;
    }

    /**
     * Get Value
     *
     * @require A valid card object is chosen.
     * @ensure The associated value is retrieved.
     * @return Returns the value of the card.
     */
    public Value getValue() {
        return value;
    }

    /**
     * Get Suit
     *
     * @require A valid card object is chosen.
     * @ensure The associated suit is retrieved.
     * @return Returns the suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Get Card Image
     *
     * @require A valid card object is chosen.
     * @ensure The associated card image is retrieved.
     * @return Returns an icon of the card image.
     */
    public Icon getCardImage() {
        return cardImage;
    }

    /**
     * Set Card Image
     *
     * @param cardImage The image connected to the card (front or back).
     * @require A valid card object is chosen.
     * @ensure The image is assigned to the card object.
     */
    public void setCardImage(Icon cardImage) {
        this.cardImage = cardImage;
    }

    /**
     * To String
     *
     * @require A valid card object is chosen.
     * @ensure The suit and value is retrieved.
     * @return Returns an the suit and value as a String.
     */
    @Override
    public String toString() {
        return value + "of" + suit;
    }

    /**
     * Get Numerical Value
     *
     * @require A valid card object is chosen.
     * @ensure A numerical value is given that coordinates with the value of the
     * card.
     * @return Returns an integer value of numerical value of the card.
     */
    public int getNumericalValue() {

        int numberValue = 0;

        switch (this.value) {
            case ACE:
                numberValue = 1;
                break;
            case TWO:
                numberValue = 2;
                break;
            case THREE:
                numberValue = 3;
                break;
            case FOUR:
                numberValue = 4;
                break;
            case FIVE:
                numberValue = 5;
                break;
            case SIX:
                numberValue = 6;
                break;
            case SEVEN:
                numberValue = 7;
                break;
            case EIGHT:
                numberValue = 8;
                break;
            case NINE:
                numberValue = 9;
                break;
            case TEN:
                numberValue = 10;
                break;
            case JACK:
                numberValue = 10;
                break;
            case QUEEN:
                numberValue = 10;
                break;
            case KING:
                numberValue = 10;
                break;
        }//end switch

        return numberValue;

    }//end getNumericalValue
}
