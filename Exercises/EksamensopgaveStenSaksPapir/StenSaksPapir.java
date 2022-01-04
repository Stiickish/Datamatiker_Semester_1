package EksamensopgaveStenSaksPapir;

import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    public String brugerValg() {
        System.out.println("Sten, saks eller papir? ");
        String svar  = scanner.nextLine();
        return svar;
    }

    public String computerValg() {

        int computerInput = Integer.valueOf(rand.nextInt(3));
        System.out.println(computerInput);
        return String.valueOf(computerInput);
    }

}

}
