/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

import javax.swing.Icon;

public interface CardInterface {

    /**
     * Get Value
     *
     * @require A valid card object is chosen.
     * @ensure The associated value is retrieved.
     * @return Returns the value of the card.
     */
    public Card.Value getValue();

    /**
     * Get Suit
     *
     * @require A valid card object is chosen.
     * @ensure The associated suit is retrieved.
     * @return Returns the suit of the card.
     */
    public Card.Suit getSuit();

    /**
     * Get Card Image
     *
     * @require A valid card object is chosen.
     * @ensure The associated card image is retrieved.
     * @return Returns an icon of the card image.
     */
    public Icon getCardImage();

    /**
     * Set Card Image
     *
     * @param cardImage The image connected to the card (front or back).
     * @require A valid card object is chosen.
     * @ensure The image is assigned to the card object.
     */
    public void setCardImage(Icon cardImage);

    /**
     * To String
     *
     * @require A valid card object is chosen.
     * @ensure The suit and value is retrieved.
     * @return Returns an the suit and value as a String.
     */
    @Override
    public String toString();

    /**
     * Get Numerical Value
     *
     * @require A valid card object is chosen.
     * @ensure A numerical value is given that coordinates with the value of the card.
     * @return Returns an integer value of numerical value of the card.
     */
    public int getNumericalValue();

}
