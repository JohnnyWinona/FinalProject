package GamePackage;

import MainPackage.Deck;
import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Blackjack implements BlackjackInterface {

    public static final int BUST_VALUE = 21;

    Deck bjDeck = new Deck();

    public List<Card> generateHand() {
        List<Card> temp = new ArrayList<Card>();
        bjDeck.shuffleDeck();
        temp.add(bjDeck.draw());
        temp.add(bjDeck.draw());
        return temp;
    }

    public Card hit() {
        bjDeck.shuffleDeck();
        return bjDeck.draw();
    }

    public int getSum(List<Card> hand) {
 
        int sum = 0;
 
        for (int x = 0; x < hand.size(); x++) {
            sum += hand.get(x).getNumericalValue();
        }
       
        if(sum > 21) {
            for(int i = 0; i < hand.size(); i++) {
                if(hand.get(i).getValue().compareTo(Card.Value.ACE) == 0) {
                    sum-=10;
                    break;
                }
            }
        }
 
        return sum;
    }

    public boolean checkBust(List<Card> hand) {

        if (getSum(hand) > BUST_VALUE) {
            return true;
        }

        return false;
    }

    public int checkWinner(List<Card> playerHand, List<Card> houseHand) {
        if (getSum(playerHand) > 21) {
            if (getSum(houseHand) > 21) {
                return 0;
            }
            else {
                return -1;
            }
        } else if (getSum(houseHand) > 21) {
            if (getSum(playerHand) > 21) {
                return 0;
            } else {
                return 1;
            }
        } else if (getSum(playerHand) == getSum(houseHand)) {
            return 0;
        } else {
            if (getSum(playerHand) > getSum(houseHand)) {
                return 1;
            } else if (getSum(playerHand) < getSum(houseHand)) {
                return -1;
            }
        }
        return 2;
    }

}
