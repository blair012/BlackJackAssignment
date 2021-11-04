public class Card {
    public final String rank;
    public final String suit;
    public final int val;

    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
        val = getValue(rank);
    }

    private int getValue(String rank) {
        int value = 0;

        //process using if statements
        /*
        if(rank.equals("Ace")) {
            value = 1;
        }else if(rank.equals("Jack") || rank.equals("Quen") || rank.equals("King")){
                value = 10;
        }else{
            value = Integer.parseInt(rank);
        }
        */

        //process using try-catch
        try{
            value = Integer.parseInt(rank);
        }catch(java.lang.NumberFormatException ex){
            if(rank.equals("Ace")){
                value = 1;
            }else{
                value = 10;
            }
        }

        return value;
    }
}
