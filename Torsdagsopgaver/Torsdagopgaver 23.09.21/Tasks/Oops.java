/*
*
* Hvis du kompilerer programmet får du 7 fejl.
* Kan du fixe programmet så det kan køre og
* outputtet bliver:
* "7 is the smallest!"
*
*
*/
public class Oops {

  public static void main(String[] args) {
    int smaller;
    int a = 7, b = 42;
    smaller =minimum(a,b);

    System.out.println(smaller + " is the smallest!");
  }
  public static int minimum(int a, int b) {
      int smaller;
    if (a < b) {
      smaller=a;
    } else{
      smaller=b;

    }
    return smaller;
  }
}

/*public class Oops {
  public static void main(String[] args) {
    int a = 7, b = 42;
    System.out.println(minimum(a,b) + " is the smallest!");
  }
  public static int minimum(int a, int b) {
    if (a < b) {
      return a;
    }
    return b;
  }
}*/

/*public class Oops {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
    System.out.println(minimum(a,b) + " is the smallest!");
  }
  public static int minimum(int a, int b) {
    if (a < b) {
      return a;
    }
    return b;
  }
}*/
