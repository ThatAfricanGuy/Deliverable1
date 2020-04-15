package sd.deliverable.pkg3;

public class Card {
    
    private String card;
    private Suit suite;
    private Rank value;
    
    public Card(Rank value, Suit suite){
        this.value = value;
        this.suite = suite;
        this.card = value.getShortName()+suite.getDispSymbol();
    }

    public String getCard() {
        return this.card;
    }

    /**
     *
     * @param card
     */
    public void setCard(String card) {
        this.card = card;
    }

    public Suit getSuite() {
        return this.suite;
    }

    /**
     *
     * @param suite
     */
    public void setSuite(Suit suite) {
        this.suite = suite;
    }

    public Rank getValue() {
        return this.value;
    }

    /**
     *
     * @param value
     */
    public void setValue(Rank value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getCard() + " - " + value+suite;
    }

}
