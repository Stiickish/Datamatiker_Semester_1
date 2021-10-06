package TaskOne;

public class Car {
    //Variables in private mode

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car(String make, String model, int year, String bodyStyle) { //Constructor
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public Driver getDriver() { //our getter
        return driver;
    }

    public void setDriver(Driver driver) { //our setter
        this.driver = driver;
    }

    //Override toString method
    @Override
    public String toString() {
        String s;
        s = "Make: " + make + " Model" + model + " (" + year + ") BodyStyle " + bodyStyle;
        return s;

    }

}
