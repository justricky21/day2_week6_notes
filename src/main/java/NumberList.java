import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> ArrayList){
        this.numbers = ArrayList;
    }

    public int getNumberCount(){
        return numbers.size();
    }

    public void addNumber(int toAdd){
        numbers.add(toAdd);
    }

    public int getNumberAtIndex(int index){
        return this.numbers.get(index);
    }

    public int getTotal(){
        int total = 0;
        for (int i = 0; i < getNumberCount(); i++){
            total += getNumberAtIndex(i);
        }
        return total;
    }
    public int getEnhancedTotal() {
        int total = 0;
        for (int number: numbers) {
            total += number;
        }
        return total;
    }
}
