package EksamensopgaveStenSaksPapir;

import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public String brugerValg() {
        System.out.println("Sten, saks eller papir? ");
        String svar = scanner.nextLine();
        return svar;
    }

    public String computerValg() {
        int computerInput = 0;
        computerInput = (int) (Math.random() * 3);

        return String.valueOf(computerInput);
    }

    public void spil() {

        int spiller = 0;
        int computer = 0;
        int runde = 0;
        int uafgjort = 0;
        int computerSvar = Integer.valueOf(computerValg());
        String brugerValgSvar = brugerValg();

        //while (runde < 3) {

            switch (brugerValgSvar) {
                case "sten":
                    if (computerSvar == 0) {
                        System.out.println("Tie!");
                        uafgjort++;
                    } else if (computerSvar == 1) {
                        System.out.println("Computer win!");
                        computer++;
                    } else {
                        System.out.println("Player win!");
                        spiller++;
                        runde++;
                    }
                    break;
                case "saks":
                    if (computerSvar == 0) {
                        System.out.println("Player win!");
                        spiller++;
                        runde++;
                    } else if (computer == 1) {
                        System.out.println("Tie!");
                        uafgjort++;
                    } else {
                        System.out.println("Computer win!");
                        computer++;
                    }
                    break;
                case "papir":
                    if (computer == 0) {
                        System.out.println("Computer win!");
                        computer++;
                    } else if (computer == 1) {
                        System.out.println("Player win!");
                        spiller++;
                        runde++;
                    } else {
                        System.out.println("Tie!");
                        uafgjort++;
                    }
                    break;
                default:
                    System.out.println("I only recognise sten, saks or papir");
                    //spil();
                    break;

            //}
        }
        System.out.println("");
        System.out.println("Spilleren har vundet:  " + spiller);
        System.out.println("Computeren har vundet: " + computer);
        System.out.println("Antal uafgjorte kampe: " + uafgjort);
    }
}




