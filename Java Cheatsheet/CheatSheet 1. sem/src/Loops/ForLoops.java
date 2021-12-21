package Loops;

public class ForLoops {
    //For Loops bruges til at gennemkøre en blok kode x antal gange, som vi bestemmer.
    //For loops indeholder 3 statements. 0 initialisering, 1 boolean expression, 3 iteration expression
    //Statement 1. Her deklareres og initialiseres en variabel til brug i loopens krop. Denne variabel bruges oftest inde i sløjfen som tæller
    //Statement 2. Dette er nøjagtig det samme som de boolske tests, der findes i betingede udsagn og while loops. Det kan være ethvert udtryk, der evalueres til sandt/falsk
    //Statement 3. Det sidste lement er en instruktion, som du ønsker skal ske med hver loopcyklus. Bemærkm at instruktionen udføres ved slutningen af hver cyklus gennem sløjfen

    //    0        1    3
    //for(int i=0; i<?; i++){
         //2 her køres kode blokken}


    //Eksempel 1 printer alle tal fra 0-9
    public static void main(String[] args) {
    for(int i=0; i<10; i++){
        System.out.println(i);
    }
        //Eksempel 2 nested for loops. Her kører vi alle kombinationer igennem af produktet af 2 terninger
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                System.out.println((i+1)+" og " + (j+1)+ " = "+((i+1)*(j+1)));
            }

        }

    }
}
