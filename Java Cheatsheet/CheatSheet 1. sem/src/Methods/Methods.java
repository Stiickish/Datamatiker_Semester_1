package Methods;

//Metoder er en blok kode, som kun kører når den bliver kaldt
//Metoder kan kaldes indefra forskellige klasser
//Man kan indsætte parameter i en metode, for at udføre en bestemt handling
//Man bruger metoder, for at genbruge kode, som man definere én gang, men kan bruges flere gange
//Metoder skal kaldes inde fra en klasse (ALDRIG udenfor en klasse)
//Static metoder og non static metoder kan ikke snakke sammen. Men man kan få dem til det.. Se eksempel 2

public class Methods {

    /*
    Eksempel på hvad man kan gøre med metoder på et objekt
    // Create a Main class
public class Main {

  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Main myCar = new Main();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// The car is going as fast as it can!
// Max speed is: 200


Eksempel 2 på static og non static metoder

public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}
Eksempel på hvordan man kalder en metode i Main klassen

Example
Create a method inside Main:

public class Main {
  static void myMethod() {
    // code to be executed
  }
}

Example
Inside main, call the myMethod() method:

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"

Eksempel på hvordan man kan kalde en metode flere gange i Main klassen

public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();
    myMethod();
  }
}

// I just got executed!
// I just got executed!
// I just got executed!

Eksempel på return med parameter

Example
public class Main {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
// Outputs 8 (5 + 3)

     */
}
