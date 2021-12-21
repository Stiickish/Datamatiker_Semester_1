package JavaMeanings;

public class Static {
    //Static er en non-access modifier, brugt i metoder og attributter. Statiske metoder og attributter kan få adgang uden at skulle lave et nyt objekt af en klasse


    //Eksempel 1
    public static void main(String[] args) {
        Murloc mrglgrlbrgl = new Murloc(10);
        Murloc mrgtrotlfnfbdrrl = new Murloc(5);
        // begge murlocs vil nu have 5 hp da det er en statisk værdi, og kode bliver læst oppefra og ned

        mrglgrlbrgl.hit(-5);

        //mrglgrlbrgl og mrgtrotlfnfbdrrl vil begge blive ramt og begge miste 5 health;
    }

    //Eksempel 2
    /*

    World of Warcraft eksempel:
    du har en klasse af murloc, du laver en static int health.
    Du laver nu 5 murlocs, hvis du så vælger at slå på 1 murloc, og den så mister health, mister de alle health da klassens health er static
    hvis du laver den non-static ville du kun ramme den ene murloc og kun den ene murloc ville miste health.

    Ergo: en static variable på et object vil, manipulere alle objekter af den specifikke klasse.
     */
}
