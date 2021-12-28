package TaskOne;

public class Driver {

    private String name = "Long";
    private int age = 29;

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;


    }

    @Override
    public String toString() {
        String s;
        s = name;
        return " is driven by " + name;


    }
}
