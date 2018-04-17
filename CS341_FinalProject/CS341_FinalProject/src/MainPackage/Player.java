package MainPackage;


/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Player {

    //data members
    private String username;
    private int funds;
    
    //blackjack stats
    private double blackjackRatio;
    private int bjWins;
    private int bjLosses;
            
    //memory match stats
    private int mmEasySolves;
    private int mmMediumSolves;
    private int mmHardSolves;
    
    //simon says stats
    private int ssSolves;
    
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
        return username + ": " + funds;
    }
    
    public double getBlackjackRatio() {
        
        blackjackRatio = (double) bjWins / (double) bjLosses;
        
        return blackjackRatio;
    }

    public void setBlackjackRatio(double blackjackRatio) {
        this.blackjackRatio = blackjackRatio;
    }

    public int getBjWins() {
        return bjWins;
    }

    public void setBjWins(int bjWins) {
        this.bjWins = bjWins;
    }

    public int getBjLosses() {
        return bjLosses;
    }

    public void setBjLosses(int bjLosses) {
        this.bjLosses = bjLosses;
    }

    public int getMmEasySolves() {
        return mmEasySolves;
    }

    public void setMmEasySolves(int mmEasySolves) {
        this.mmEasySolves = mmEasySolves;
    }

    public int getMmMediumSolves() {
        return mmMediumSolves;
    }

    public void setMmMediumSolves(int mmMediumSolves) {
        this.mmMediumSolves = mmMediumSolves;
    }

    public int getMmHardSolves() {
        return mmHardSolves;
    }

    public void setMmHardSolves(int mmHardSolves) {
        this.mmHardSolves = mmHardSolves;
    }

    public int getSsSolves() {
        return ssSolves;
    }

    public void setSsSolves(int ssSolves) {
        this.ssSolves = ssSolves;
    }

    public int getSjWins() {
        return sjWins;
    }

    public void setSjWins(int sjWins) {
        this.sjWins = sjWins;
    }

    public int getSjLosses() {
        return sjLosses;
    }

    public void setSjLosses(int sjLosses) {
        this.sjLosses = sjLosses;
    }

}
