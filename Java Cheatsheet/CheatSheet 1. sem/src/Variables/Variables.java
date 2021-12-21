package Variables;


public class Variables {

    public static void main(String[] args) {



    /* En variabel er en placeholder for noget data
    som man kan bruge senere i sit program.
     */

        //Alle variabler skal have en datatype og et navn

        //Nedenunder ses de primitive variable typer


        byte smallNumbers = -128; // går til 127;
        short mediumNumbers = -32768; // går til 32767;
        int largeNumbers = 12345;
        long ridiculousNumbers;
        float decimals = 25.5f; // Husk "f" hvis den melder fejl
        double moreDecimals = 25.34;
        String name = "Pepsi laks";
        char characters = 'a';
        boolean trueOrFalse = false;

        //Eksempel på brug

        int age1 = 29; //Eksempel 1 direkte instantiering

        //int age2;      //Eksempel 2 deklarering med senere instantiering
        //age2 = 29;

        String test = "Hej med dig " + name; //Eksempel 1
        System.out.println(test);


        String test2 = "Hej ";               //Eksempel 2
        test2 += "med dig";
        System.out.println(test2);

        String test3 = "Hej med dig \n" + name; //Eksempel 3 \n linjeskift skal være inde i String
        System.out.println(test3);

        String welcome = "Welcome to Hogwarts... "; //Eksempel 4 sådan her printer man 2 forskellige String ud med linjeskift
        String test4 = welcome + "\n" + name;
        System.out.println(test4);

        //Eksempel 5 med boolean // boolean returns a false statements instead of true because of ! operator
        boolean isHapppy = true;
        if(isHapppy){
            isHapppy = !isHapppy;
            System.out.println(isHapppy);

        }

    }

}


