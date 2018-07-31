import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> school;

    public River(){
        school = new ArrayList<>();
    }

    public int salmonCount(){
        return this.school.size();
    }

    public void addFish(Salmon fish){
        this.school.add(fish);
    }

    public Salmon removeFish(){
        return this.school.remove(0);
    }

}
