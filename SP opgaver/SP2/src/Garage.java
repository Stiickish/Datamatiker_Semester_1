import java.util.ArrayList;

public class Garage {

    private String name;
    ArrayList<Bil> bilArrayList = new ArrayList<>();

    public Garage(String name) {
        this.bilArrayList = bilArrayList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bil> getBilArrayList() {
        return bilArrayList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBilArrayList(Bil bil) {
        this.bilArrayList.add(bil);
    }


    @Override
    public String toString() {
        return "Garage{" + "name='" + name + '\'' + '}';

    }

    //Metode til at udregne samlet grøn udgift i bil park
    public double beregnGrønAfgiftForBilpark() {
        double samletAfgift = 0;
        for (Bil b : bilArrayList) {
            samletAfgift += b.beregnGrønAfgift();
        }
        return samletAfgift;
    }
}
