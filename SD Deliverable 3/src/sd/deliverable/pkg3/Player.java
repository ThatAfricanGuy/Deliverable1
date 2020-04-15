/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package sd.deliverable.pkg3;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public class Player {

    private String playerID; //the unique ID for this player
    private double totalBet;
    private ArrayList<Card> CardHand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(){
        
    }

    public Player(String name) {
        playerID = name;
        CardHand = new ArrayList<Card>();
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    public double getTotalBet() {
        return this.totalBet;
    }

    /**
     *
     * @param totalBet
     */
    public void setTotalBet(double totalBet) {
        this.totalBet = totalBet;
    }

    public void placeBet() {
        // TODO - implement Player.placeBet
        throw new UnsupportedOperationException();
    }

    public void doubleDown() {
        // TODO - implement Player.doubleDown
        throw new UnsupportedOperationException();
    }

    public boolean stand() {
        // TODO - implement Player.stand
        throw new UnsupportedOperationException();
    }

    public boolean continute() {
        // TODO - implement Player.continute
        throw new UnsupportedOperationException();
    }

    public boolean hit() {
        // TODO - implement Player.hit
        throw new UnsupportedOperationException();
    }

    /**
     * @return the CardHand
     */
    public ArrayList<Card> getCardHand() {
        return CardHand;
    }

    /**
     * @param CardHand the CardHand to set
     */
    public void setCardHand(ArrayList<Card> CardHand) {
        this.CardHand = CardHand;
    }

}
