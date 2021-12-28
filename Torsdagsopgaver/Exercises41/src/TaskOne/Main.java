package TaskOne;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("Long", 29);


        Car suvCar = new Car("Honda:", " Civic", 2016, "Hatchback");

        Car miniCar = new Car("Mini:"," Mini Cabrio", 2020, "Sedan");

        suvCar.setDriver(driver);
        miniCar.setDriver(driver);

        System.out.println(suvCar +""+ suvCar.getDriver());
        System.out.println(miniCar +""+ miniCar.getDriver());
    }


}

