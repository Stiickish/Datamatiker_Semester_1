package Loops;

public class DoWhileLoops {
    //Do -while loop, er en gren af en while loop.
    //En do - while loop vil eksekvere do koden, før den tjekker while præmisen. I forhold til while som tjekker før den kører koden


    //Eksempel 1.
    String userChoice;

        do {
        userChoice = userInputWithMsg("Skriv Q for at afslutte." + "\n" +
                "Skriv Opret for at oprette konti." + "\n" +
                "Skriv vis for at få vist en eller flere konti." + "\n");

        if (userChoice.equals("opret")) {
            System.out.println("du har valgt opret");
            createAccounts();
        }
        else if (userChoice.equals("vis")) {
            System.out.println("Du har valgt vis");
            searchAccounts();
        }

    } while (!userChoice.equals("q"));
        System.out.println("Du har forladt banken.");
}
