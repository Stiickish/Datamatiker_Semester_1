package Loops;

public class whileLoops {
    //While loops bruges til at køre en blok kode igennem, så længe en specifik præmis er sandt.
    //While loop bruges til boolean expressions, mens en for/for each på alt andet end true/false expressions.
    //While loops bruges også til at "læse" filer, hvis filen har en næste linje.


    public static void main(String[] args) {
        int i = 0;
        while (i < 8) {
            System.out.println("Hej med dig" + (i + 1));
            i++;
        }
        //Eksempel 1.while loop bruges til at kigge på en fil, så længe der er en linje. (has.NextLine)
        while(scan.hasNextLine()){

            fieldsArray[counter] = scan.nextLine();
            counter++;
        }
    }

}
