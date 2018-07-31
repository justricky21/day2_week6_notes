import java.util.ArrayList;

public class Card {
    private SuiteType suite;
    private NumberType number;
    public Card (SuiteType suite, NumberType number){
        this.number = number;
        this.suite = suite;
    }

    public SuiteType getSuite(){
        return this.suite;
    }

    public NumberType getNumber(){
        return this.number;
    }

    public static ArrayList<Card> getDeck(){
        ArrayList<Card> deck = new ArrayList<>();

        SuiteType[] allSuites = SuiteType.values();
        NumberType[] allNumbers = NumberType.values();
        for (NumberType number : allNumbers){
            for (SuiteType suite : allSuites) {
                Card newCard = new Card(suite, number);
                deck.add(newCard);
            }
        }

        return deck;
    }

}
