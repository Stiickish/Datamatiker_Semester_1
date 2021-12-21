package Conditionals;

public class Conditionals {
    //If statements bruges til at køre en blok kode, hvis en specifik præmis er opnået. Se eksempel 1
    //else if statements bruges til at køre næste blok kode, hvis første præmis ikke er opnået, skal den tjekke om næste præmis kan opnås. Se eksempel 2
    //else statements bruges, hvis overstående præmis ikke er opnået. Else er en skraldespand.Den fanger alt. Se eksempel 3


    /*
    SYNTAX
    if (condition) {
        // block of code to be executed if the condition is true
    }
    */

    //Eksempel 1
if(20>18){
        System.out.println("20 is greater than 18");
    }
/*
SYNTAX
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
 */

    //Eksempel 2
    int time = 20;
if (time < 18) {
    System.out.println("Good day.");
    } else {
    System.out.println("Good evening.");
    }
// Outputs "Good evening."
}


/*
SYNTAX
if (condition1) {

// block of code to be executed if condition1 is true
} else if (condition2) {
    // block of code to be executed if the condition1 is false and condition2 is true
} else {
    // block of code to be executed if the condition1 is false and condition2 is false
}
*/

    //Eksempel 3
int time = 22;
if (time < 10) {
    System.out.println("Good morning.");
} else if (time < 20) {
    System.out.println("Good day.");
} else {
    System.out.println("Good evening.");
}
// Outputs "Good evening."
