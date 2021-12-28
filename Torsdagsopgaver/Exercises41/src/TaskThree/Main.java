package TaskThree;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {


        Customer customer1 = new Customer("Mads", " Herlevsen:", " RedHare");
        Customer customer2 = new Customer("Casper ", "Posche: ", " Fluffa");
        Customer customer3 = new Customer("Mia ", "Falk: ", " Schnackminister");
        Customer customer4 = new Customer("Martin ", "Lorentzen: ", " Zendary");
        Customer customer5 = new Customer("Ye Long ", "He: ", " Stiickish");
        Customer customer6 = new Customer("Per ", "Persson: ", " Personius");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();

    }

    public static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}

