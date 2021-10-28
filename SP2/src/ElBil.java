public class ElBil extends Bil {

    private int batteriKapacitetkw;
    private int maxKm;
    private int wPrKm;

    // Nedarver fra super classen Bil, og for at vi kan bruge super classens variabler, bruger vi keyword super i vores konstruktør, så vi kan tilgå dem.
    public ElBil(String regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetkw, int maxKm, int wPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetkw = batteriKapacitetkw;
        this.maxKm = maxKm;
        this.wPrKm = wPrKm;
    }

    public int getBatteriKapacitetkw() {
        return batteriKapacitetkw;
    }

    public void setBatteriKapacitetkw(int batteriKapacitetkw) {
        this.batteriKapacitetkw = batteriKapacitetkw;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getwPrKm() {
        return wPrKm;
    }

    public void setwPrKm(int wPrKm) {
        this.wPrKm = wPrKm;
    }

// Vi bruger toString metoden til at hente informationer fra super classen
    @Override
    public String toString() {
        String s = super.toString();
        s+= "ElBil{" + "batteriKapacitetkw=" + batteriKapacitetkw + ", maxKm=" + maxKm + ", wPrKm=" + wPrKm + '}';
        return s;
    }
//metode til at beregne grøn afgift
    @Override
    public double beregnGrønAfgift() {
        double ejerAfgift = 0;
        double kmPrl = 100 / (wPrKm / 91.25); //formlen til at udregne watt pr km til km pr liter

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


