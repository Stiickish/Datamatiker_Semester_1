package Loops;

public class ForEach {
    //For-Each loop, bruges udelukkende til at løbe igennem elementer i et Array
    public static void main(String[] args) {


        //Eksempel 1
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
