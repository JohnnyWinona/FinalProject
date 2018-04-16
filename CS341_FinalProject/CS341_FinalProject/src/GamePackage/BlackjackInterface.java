package GamePackage;


import MainPackage.Card;
import java.util.*;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public interface BlackjackInterface {

    public Card hit();

    public int getSum(List<Card> hand);

    public boolean checkBust(List<Card> hand);

    public int checkWinner(List<Card> playerHand, List<Card> houseHand);

}
