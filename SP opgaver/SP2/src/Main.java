public class Main {

    public static void main(String[] args) {

        // Vi laver vores 3 biler
        Bil bil = new BenzinBil("JM23456", "VW", "Bubble",1990,5,95,10);
        Bil bil2 = new ElBil("AN23456","Tesla","S",2020,5,100,600,200);
        Bil bil3 = new DieselBil("VM24556","Peugot","3008",2018,5,false,15);

        //Vi laver garagen og kalder den BilPark
        Garage garage = new Garage("BilPark");

        //Sætter bilerne i garagen
        garage.setBilArrayList(bil);
        garage.setBilArrayList(bil2);
        garage.setBilArrayList(bil3);


        //Vi beregner den grønne afgift for alle 3 biler
        System.out.println(bil.beregnGrønAfgift());
        System.out.println(bil2.beregnGrønAfgift());
        System.out.println(bil3.beregnGrønAfgift());

        //Grøn afgift for alle bilerne i BilPark
        System.out.println(garage.beregnGrønAfgiftForBilpark());

        //For each loop, til at printe vores ArrayList ud med bilerne i garagen
        for(Bil b : garage.getBilArrayList()){
            System.out.println(b);
        }
    }
}
