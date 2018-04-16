package GamePackage;

import MainPackage.Deck;
import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class MemoryMatch implements MemoryMatchInterface {

    List<Card> original = new ArrayList<Card>();
    List<Card> copy = new ArrayList<Card>();
    Deck mmDeck = new Deck();

    String difficulty;

    public List<Card> getCards() {
        return original;
    }

    public void generateMemoryMatch(String difficulty) {

        switch (difficulty) {
            case "easy":
                easyMode();
                break;
            case "medium":
                mediumMode();
                break;
            case "hard":
                hardMode();
                break;
        }
    }

    //four cards
    public void easyMode() {
        original.clear();
        copy.clear();

        mmDeck.shuffleDeck();

        original.add(mmDeck.draw());
        original.add(mmDeck.draw());

        copy = original;

        original.add(copy.get(0));
        original.add(copy.get(1));
    }

    //six cards
    public void mediumMode() {
        original.clear();
        copy.clear();

        mmDeck.shuffleDeck();

        original.add(mmDeck.draw());
        original.add(mmDeck.draw());
        original.add(mmDeck.draw());

        copy = original;

        original.add(copy.get(0));
        original.add(copy.get(1));
        original.add(copy.get(2));
    }

    //eight cards
    public void hardMode() {
        original.clear();
        copy.clear();

        mmDeck.shuffleDeck();

        original.add(mmDeck.draw());
        original.add(mmDeck.draw());
        original.add(mmDeck.draw());
        original.add(mmDeck.draw());

        copy = original;

        original.add(copy.get(0));
        original.add(copy.get(1));
        original.add(copy.get(2));
        original.add(copy.get(3));
    }

    public boolean isMatch(Card cardOne, Card cardTwo) {
        if (cardOne.getSuit().equals(cardTwo.getSuit())) {
            if (cardOne.getValue().equals(cardTwo.getValue())) {
                return true;
            }
        }
        return false;
    }

}
