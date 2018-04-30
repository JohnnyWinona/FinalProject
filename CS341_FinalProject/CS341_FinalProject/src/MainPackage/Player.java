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
    private String username = "";
    private int funds = 0;

    //blackjack stats
    private int bjWins = 0;
    private int bjLosses = 0;

    //memory match stats
    private int mmEasySolves = 0;
    private int mmMediumSolves = 0;
    private int mmHardSolves = 0;

    //simon says stats
    private int ssHighest = 0;

    //slapjack stats
    private int sjWins = 0;
    private int sjLosses = 0;

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

    public String getAllStats() {

        return "\n-------BLACKJACK--------------"
                + "\nWins: " + bjWins
                + "\nLosses: " + bjLosses
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

    public int getBjWins() {
        return bjWins;
    }

    public void setBjWins(int num) {
        this.bjWins = num;
    }

    public int getBjLosses() {
        return bjLosses;
    }

    public void setBjLosses(int num) {
        this.bjLosses = num;
    }

    public int getMmEasySolves() {
        return mmEasySolves;
    }

    public void setMmEasySolves(int num) {
        this.mmEasySolves = num;
    }

    public int getMmMediumSolves() {
        return mmMediumSolves;
    }

    public void setMmMediumSolves(int num) {
        this.mmMediumSolves = num;
    }

    public int getMmHardSolves() {
        return mmHardSolves;
    }

    public void setMmHardSolves(int num) {
        this.mmHardSolves = num;
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

    public void setSjWins(int num) {
        this.sjWins = num;
    }

    public int getSjLosses() {
        return sjLosses;
    }

    public void setSjLosses(int num) {
        this.sjLosses = num;
    }
}
