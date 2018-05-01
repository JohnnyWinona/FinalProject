/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
package MainPackage;

public interface PlayerInterface {

    /**
     * Get Username
     *
     * @require The user to set a username for it's player.
     * @ensure The username assigned to the current player is retrieved.
     * @return Returns a String value for the username of the current player.
     */
    public String getUsername();

    /**
     * Set Username
     *
     * @param username The user-defined username for the current player.
     * @require User-input for the desired username.
     * @ensure The current player is assigned to the chosen username.
     */
    public void setUsername(String username);

    /**
     * Get Funds
     *
     * @require A valid number of funds exist for the current player.
     * @ensure The funds for the current player is retrieved.
     * @return Returns an integer value the total funds for the defined player.
     */
    public int getFunds();

    /**
     * Set Funds
     *
     * @param funds The amount of funds to be added to the current players
     * existing funds.
     * @require A valid player is defined and created. A game must be won or the
     * player is being created in order to set the funds.
     * @ensure The current user has an updated fund quantity.
     */
    public void setFunds(int funds);

    /**
     * toString
     *
     * @require A player is chosen and information is needed to output.
     * @ensure The player's username and funds are retrieved.
     * @return Returns a String of the username and an integer of the current
     * funds.
     */
    @Override
    public String toString();

    /**
     * Get All Statistics
     *
     * @require A player is chosen and the statistics are needed to be shown.
     * @ensure All of the statistics for each game are retrieved.
     * @return Returns a String of all the statistics for each game.
     */
    public String getAllStats();

    /**
     * Get Blackjack Wins
     *
     * @require A player is chosen and the total win amount is needed, possibly
     * for incrementing statistical information.
     * @ensure The total number of blackjack wins for the player is retrieved.
     * @return Returns an integer value associated with the total number of
     * blackjack wins for the player.
     */
    public int getBjWins();

    /**
     * Set Blackjack Wins
     *
     * @param num The updated number of blackjack wins for a player.
     * @require A player to be chosen before setting statistics.
     * @ensure A new number of blackjack wins is assigned to the player.
     */
    public void setBjWins(int num);

    /**
     * Get Blackjack Losses
     *
     * @require A player is chosen and the total loss amount is needed, possibly
     * for incrementing statistical information.
     * @ensure The total number of blackjack losses for the player is retrieved.
     * @return Returns an integer value associated with the total number of
     * blackjack losses for the player.
     */
    public int getBjLosses();

    /**
     * Set Blackjack Losses
     *
     * @param num The updated number of blackjack losses for a player.
     * @require A player to be chosen before setting statistics.
     * @ensure A new number of blackjack losses is assigned to the player.
     */
    public void setBjLosses(int num);

    /**
     * Get Memory Match Easy Solves
     *
     * @require A player is chosen and the total number of solves for Memory
     * Match on easy mode is needed.
     * @ensure The total number of easy Memory Match solves for the player is
     * retrieved.
     * @return Returns an integer value associated with the total number of
     * Memory Match easy solves for the player.
     */
    public int getMmEasySolves();

    /**
     * Set Memory Match Easy Solves
     *
     * @param num The updated number of Memory Match solves on easy.
     * @require A player is chosen and the total number of solves for Memory
     * Match on easy mode is needed to be changed.
     * @ensure The total number of easy Memory Match solves for the player is
     * adjusted.
     */
    public void setMmEasySolves(int num);

    /**
     * Get Memory Match Medium Solves
     *
     * @require A player is chosen and the total number of solves for Memory
     * Match on medium mode is needed.
     * @ensure The total number of medium Memory Match solves for the player is
     * retrieved.
     * @return Returns an int value associated with the total number of Memory
     * Match medium solves for the player.
     */
    public int getMmMediumSolves();

    /**
     * Set Memory Match Medium Solves
     *
     * @param num The updated number of Memory Match solves on medium.
     * @require A player is chosen and the total number of solves for Memory
     * Match on medium mode is needed to be changed.
     * @ensure The total number of medium Memory Match solves for the player is
     * adjusted.
     */
    public void setMmMediumSolves(int num);

    /**
     * Get Memory Match Hard Solves
     *
     * @require A player is chosen and the total number of solves for Memory
     * Match on hard mode is needed.
     * @ensure The total number of hard Memory Match solves for the player is
     * retrieved.
     * @return Returns an int value associated with the total number of Memory
     * Match hard solves for the player.
     */
    public int getMmHardSolves();

    /**
     * Set Memory Match Hard Solves
     *
     * @param num The updated number of Memory Match solves on hard.
     * @require A player is chosen and the total number of solves for Memory
     * Match on hard mode is needed to be changed.
     * @ensure The total number of hard Memory Match solves for the player is
     * adjusted.
     */
    public void setMmHardSolves(int num);

    /**
     * Get Simon Says Highest Score
     *
     * @require A player is chosen and the high score for Simon Says is needed.
     * @ensure The Simon Says high score is retrieved.
     * @return Returns an integer value the Simon Says high score.
     */
    public int getSsHighest();

    /**
     * Set Simon Says Highest Score
     *
     * @param ssHighest The new highest score for Simon Says.
     * @require A player is chosen and the high score for Simon Says needs to be
     * updated.
     * @ensure The new Simon Says score is updated.
     */
    public void setSsHighest(int ssHighest);

    /**
     * Get Slapjack Wins
     *
     * @require A valid player is selected and the total number of Slapjack wins
     * is needed.
     * @ensure The total number of Slapjack wins for the current user is
     * retrieved.
     * @return Returns an integer value the total number of Slapjack wins for
     * the current user.
     */
    public int getSjWins();

    /**
     * Set Slapjack Wins
     *
     * @param num The new number of Slapjack wins to assign for a user.
     * @require A valid player is selected.
     * @ensure The new number of Slapjack wins is assigned to the user.
     */
    public void setSjWins(int num);

    /**
     * Get Slapjack Losses
     *
     * @require A valid player is selected and the total number of Slapjack
     * losses is needed.
     * @ensure The total number of Slapjack losses for the current user is
     * retrieved.
     * @return Returns an integer value the total number of Slapjack losses for
     * the current user.
     */
    public int getSjLosses();

    /**
     * Set Slapjack Losses
     *
     * @param num The new number of Slapjack losses to assign for a user.
     * @require A valid player is selected.
     * @ensure The new number of Slapjack losses is assigned to the user.
     */
    public void setSjLosses(int num);

    /**
     * Reset All Statistics
     *
     * @require A player to be selected in which their statistics are to be
     * reset.
     * @ensure Statistics for all games will be reset back to zero.
     *
     */
    public void resetAllStats();

}
