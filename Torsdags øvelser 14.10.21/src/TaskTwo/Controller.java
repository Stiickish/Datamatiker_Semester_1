package TaskTwo;

import static TaskTwo.ComputeVAT.MSG;

public class Controller {

    Dialog dialog;
    CalculateVAT calculateVAT;
    View view;

    public Controller() {
    this.dialog = new Dialog();
    this.calculateVAT= new CalculateVAT();
    this.view= new View();

    }

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVAT.doVAT(userIn);
        view.doView(moms,MSG);
    }

}
