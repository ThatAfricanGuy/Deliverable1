/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package sd.deliverable.pkg3;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {

    private final String gameName;
    private GroupOfCards deck;
    private Player player;// the players of the game
    private Player botPlayer;//optional computer player

    public Game(String givenName) {
        gameName = givenName;
        player = new Player("Temp");
        deck = new GroupOfCards(52);
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public int playHit(){
        int total = 0;
        getPlayer().getCardHand().add(getDeck().getRandomCard());
        getBotPlayer().getCardHand().add(getDeck().getRandomCard());
        System.out.println("<You and the computer received one new card>");
        System.out.println(getPlayer().getPlayerID()+ "'s Cards: ");
        for(Card c: getPlayer().getCardHand()){
            System.out.print(c.getCard() + " ");
            total += c.getValue().getDispNum();
        }
        System.out.println("");
        if(total > 21){
            System.out.println("You lose! You went over 21.");
            System.out.println("You lost: $" + getPlayer().getTotalBet());
            return 0;
        }else
            return 1;
    }
    
    public void playStand(){
        int total = 0;
        int compTotal = 0;
        System.out.print(getPlayer().getPlayerID()+ "'s Cards: ");
        for(Card c: getPlayer().getCardHand()){
            System.out.print(c.getCard() + " ");
            total += c.getValue().getDispNum();
        }
        System.out.println("");
        System.out.print("Computer's Cards: ");
        for(Card c: getBotPlayer().getCardHand()){
            System.out.print(c.getCard() + " ");
            compTotal += c.getValue().getDispNum();
        }
        System.out.println("");
        if(total > compTotal || compTotal > 21){
            System.out.println("You win!");
            System.out.println("You win: $" + getPlayer().getTotalBet() * 2);
        }else{
            System.out.println("You lose! The computer wins.");
            System.out.println("You lost: $" + getPlayer().getTotalBet());
        }
    }
    
    public void playBet(double bet){
        getPlayer().setTotalBet(getPlayer().getTotalBet() + bet);
    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner() {

    }

    public GroupOfCards getDeck() {
        return this.deck;
    }

    /**
     *
     * @param deck
     */
    public void setDeck(GroupOfCards deck) {
        this.deck = deck;
    }

    public void deal() {
        // TODO - implement Game.deal
        throw new UnsupportedOperationException();
    }

    /**
     * @return the currentPlayer
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param currentPlayer the currentPlayer to set
     */
    public void setPlayer(Player currentPlayer) {
        this.player = currentPlayer;
    }

    /**
     * @return the botPlayer
     */
    public Player getBotPlayer() {
        return botPlayer;
    }

    /**
     * @param botPlayer the botPlayer to set
     */
    public void setBotPlayer(Player botPlayer) {
        this.botPlayer = botPlayer;
    }


}//end class
