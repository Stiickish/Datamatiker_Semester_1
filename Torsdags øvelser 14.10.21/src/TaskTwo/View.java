package TaskTwo;

import static TaskTwo.ComputeVAT.CURRENCY;
import static TaskTwo.ComputeVAT.MSG;

public class View {

    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result,CURRENCY,MSG);
    }
}
