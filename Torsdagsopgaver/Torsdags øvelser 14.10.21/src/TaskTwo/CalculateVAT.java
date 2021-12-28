package TaskTwo;

import static TaskTwo.ComputeVAT.PRCVAT;

public class CalculateVAT {

    public double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
