public class DieselBil extends Bil {


    //Variabler
    private boolean harPartikelFilter;
    private int kmPrl;

    // Nedarver fra super classen Bil, og for at vi kan bruge super classens variabler, bruger vi keyword super i vores konstruktør, så vi kan tilgå dem.
    public DieselBil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
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
        s += "DieselBil{" + "harPartikelFilter=" + harPartikelFilter + ", kmPrl=" + kmPrl + '}';
        return s;
    }

    //metode til at beregne udligningsafgift
    public double beregnUdligningsAfgift() {
        double udligningsAfgift = 0;

        if (kmPrl >= 20 && kmPrl <= 50) {
            udligningsAfgift = 130;
        } else if (kmPrl <= 20 && kmPrl >= 15) {
            udligningsAfgift = 1390;
        } else if (kmPrl < 15 && kmPrl >= 10) {
            udligningsAfgift = 1850;
        } else if (kmPrl <= 10 && kmPrl >= 5) {
            udligningsAfgift = 2770;
        } else if (kmPrl <= 5) {
            udligningsAfgift = 15260;
        }
        return udligningsAfgift;
    }

    //metode til at udregne grøn afgift
    public double beregnGrønAfgift() {
        double udligningsAfgift;
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
        //hvis bilen ikke har partikel filter, bliver der tilføjet 1000 kr ekstra i ejerafgift
        if (!harPartikelFilter) {
            ejerAfgift = 1000;
        }
        udligningsAfgift = beregnUdligningsAfgift();
        return ejerAfgift + udligningsAfgift;
    }

}




