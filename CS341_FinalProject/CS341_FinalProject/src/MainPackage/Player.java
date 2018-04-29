/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

import java.io.Serializable;

public class Player implements Serializable {

    //data members
    private String username;
    private int funds;

    //blackjack stats
    private double blackjackRatio;
    private int bjWins;
    private int bjLosses;

    //memory match stats
    public static int mmEasySolves;
    private int mmMediumSolves;
    private int mmHardSolves;

    //simon says stats
    private int ssHighest;

    //slapjack stats
    private int sjWins;
    private int sjLosses;

    public Player() {
    }

    public Player(String username, int funds) {
        this.username = username;
        this.funds = funds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    @Override
    public String toString() {
        return username + ": $" + funds;
    }
    
    public String getAllStats(){
        
        return    "\n-------BLACKJACK--------------"
                + "\nWins: " + bjWins 
                + "\nLosses: " + bjLosses
                + "\nW/L Ratio: " + blackjackRatio 
                + "\n-------MEMORY MATCH-----------"
                + "\nEasy Solves: " + mmEasySolves
                + "\nMedium Solves: " + mmMediumSolves
                + "\nHard Solves: " + mmHardSolves
                + "\n-------SIMON SAYS-------------"
                + "\nHigh Score: " + ssHighest
                + "\n-------SLAPJACK---------------"
                + "\nWins: " + sjWins
                + "\nLosses: " + sjLosses;
    }

    public double getBlackjackRatio() {

        blackjackRatio = (double) bjWins / (double) bjLosses;

        return blackjackRatio;
    }

    public int getBjWins() {
        return bjWins;
    }

    public void plusBjWins() {
        this.bjWins = bjWins++;
    }

    public int getBjLosses() {
        return bjLosses;
    }

    public void plusBjLosses() {
        this.bjLosses = bjLosses++;
    }

    public int getMmEasySolves() {
        return mmEasySolves;
    }

    public void plusMmEasySolves() {
        this.mmEasySolves = mmEasySolves++;
    }

    public int getMmMediumSolves() {
        return mmMediumSolves;
    }

    public void plusMmMediumSolves() {
        this.mmMediumSolves = mmMediumSolves++;
    }

    public int getMmHardSolves() {
        return mmHardSolves;
    }

    public void plusMmHardSolves() {
        this.mmHardSolves = mmHardSolves++;
    }

    public int getSsHighest() {
        return ssHighest;
    }

    public void setSsHighest(int ssHighest) {
        this.ssHighest = ssHighest;
    }

    public int getSjWins() {
        return sjWins;
    }

    public void plusSjWins() {
        this.sjWins = sjWins++;
    }

    public int getSjLosses() {
        return sjLosses;
    }

    public void setSjLosses() {
        this.sjLosses = sjLosses++;
    }

}
