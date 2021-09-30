//2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
//2.b Write a function that receives to integers as parameters and returns the sum of them.
//2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
//2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
public class TaskTwo{
public static boolean happy = true;
public static void main(String[] args) {
if (iAmHappy()){
System.out.println("I clap my hands");
}
else
{
System.out.println("I don't clap my hands");
}

}


public static boolean iAmHappy(){
if(happy==true){
return true;
}
else{
return false;
}
}


public static int sum(int a, int b){
  int sum= a + b;
  return sum;

}

public static String string(String string){
  return string.toUpperCase();

}

public static boolean ifUpperCase(String string){

  if(Character.isUpperCase(string.charAt(0))){
    return true;
  }
  else{
    return false;

  }
}

}
