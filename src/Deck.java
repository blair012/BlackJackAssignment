public class Deck {
    private String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private String[] suits = {"Clubs","Diamond","Hearts","Spades"};

    private Card[] myCards = new Card[52];
    private int nextCardIndex = 0;

    public Deck(){

    }
}
