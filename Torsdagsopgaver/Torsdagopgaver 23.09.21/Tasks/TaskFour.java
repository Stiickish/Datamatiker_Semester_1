/*4.a create arrays of the following type and assign it at least 3 different values:
    - Integer array
    - String array
    - boolean array*/
//4.b Write a function that takes in an array of strings as parameter and prints each string.
//4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
//4.d Write a function that receives an integer array as a parameter and returns the average value.
/*int[]array1 = new int {1,2,3,4}
String[]array2 = new String {"arbejde", "skole", "hjem", "skole"}
boolean[]array3 = new boolean {true, false, true, false}*/

public class TaskFour{

  static int[]array1 = new int[] {1,2,3,4};
  static String[]array2 = new String[] {"arbejde", "skole", "hjem", "skole"};
  static boolean[]array3 = new boolean[] {true, false, true, false};

public static void main(String[] args){

  arrayCheck(array2);
  sumArray(array1);
  avgArray(array1);

}

public static void arrayCheck(String[] array2){
for(int i=0; i<array2.length; i++){
System.out.println(array2[i]);
}
}
public static void sumArray(int[] array1){
  int sum=0;
  for(int i=0; i<array1.length; i++){
    sum+=array1[i];
  }
System.out.println(sum);
}
public static void avgArray(int[] arrays1){
int avg =0;
for(int i=0; i<array1.length; i++){
avg=avg/array1.length;

}
System.out.println(avg);
}
}
