package GamePackage;

import MainPackage.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class SimonSays implements SimonSaysInterface {

    List<Integer> order = new ArrayList<Integer>();

    public void addOrder() {
        Random rand = new Random();

        int n = rand.nextInt(4) + 1;
        order.add(order.size(), n);
    }
    
    public int size(){
        return order.size();
    }
    
    public boolean isMatch(List<Integer> inputOrder){
        return inputOrder.equals(order);
    }
    
    public List<Integer> play(){
        return order;
    }

}
