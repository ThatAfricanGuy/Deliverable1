/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.deliverable.pkg3;

/**
 *
 * @author Ritsu
 */
public enum Suit {
    CLUBS(1, "Clubs", '\u2663'),
    DIAMONDS(2, "Diamonds", '\u2662'),
    HEARTS(3, "Hearts", '\u2661'),
    SPADES(4, "Spades", '\u2660');
    
    private int dispNum;
    private String dispName;
    private char dispSymbol;
    
    private Suit(int dispNum, String dispName, char dispSymbol){
        this.dispNum = dispNum;
        this.dispName = dispName;
        this.dispSymbol = dispSymbol;
    }

    /**
     * @return the dispNum
     */
    public int getDispNum() {
        return dispNum;
    }

    /**
     * @return the dispName
     */
    public String getDispName() {
        return dispName;
    }

    /**
     * @return the dispSymbol
     */
    public char getDispSymbol() {
        return dispSymbol;
    }
    
    @Override
    public String toString(){
        return dispNum + " - " + dispName + " " + dispSymbol;
    }
}
