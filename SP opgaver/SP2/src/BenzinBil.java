public class BenzinBil extends Bil {

    //Variabler
    private int octanTal;
    private int kmPrl;

 // Nedarver fra super class Bil, og for at vi kan bruge super class variabler, bruger vi keyword 'super' i vores konstruktør, så vi kan tilgå dem.
    public BenzinBil(String regNr, String mærke, String model, int årgang, int antalDøre, int octanTal, int kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.octanTal = octanTal;
        this.kmPrl = kmPrl;
    }

    public int getOctanTal() {
        return octanTal;
    }

    public void setOctanTal(int octanTal) {
        this.octanTal = octanTal;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }


    // Vi bruger toString metoden til at hente informationer fra super classen
    @Override
    public String toString() {
        String s = super.toString();
        s+= "BenzinBil{" + "octanTal=" + octanTal + ", kmPrl=" + kmPrl + '}';
        return s;
    }

    //Udregning af grøn afgift med if else
    @Override
    public double beregnGrønAfgift() {
        double ejerAfgift = 0;

        if (kmPrl >= 20 && kmPrl <= 50) {
            ejerAfgift = 330;
        } else if (kmPrl <= 20 && kmPrl >= 15) {
            ejerAfgift = 1050;
        } else if (kmPrl < 15 && kmPrl >= 10) {
            ejerAfgift = 2340;
        } else if (kmPrl <= 10 && kmPrl >= 5) {
            ejerAfgift = 5500;
        } else if (kmPrl <= 5) {
            ejerAfgift = 10470;
        }
        return ejerAfgift;
    }

}


