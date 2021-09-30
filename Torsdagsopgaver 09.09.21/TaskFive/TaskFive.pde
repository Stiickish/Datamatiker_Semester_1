void setup() {
  MethodOne(); 
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it. 
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  if (i > max)
  {
    String output = "i is greater than "+max+".";
    println(output);
  }
}

/* 
 Finish the following method so that we can change the number assigned 
 to the weekday and it prints the correct output.  
 */
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else 
  {
    weekend = true;
  }

  if (weekDay==0)
    println("It's monday");
  else if (weekDay==1){
  println("Its tuesday");
  } else if (weekDay==2) {
    println("It's wednesday... My dudes... ");
  } else if (weekDay==3) {
    println("It's thursday");
  } else if (weekDay==4) {
    println("Yay!... It's finally weekend!");
  } else if (weekDay==5) {
   println("It's saturday");
  }else if(weekDay==6){
     println("Its sunday");
  }
if (weekDay < 5)
  {
    weekend = false;
    println("it's not the weekend");
  } else 
  {
    weekend = true;
    println("It's the weekend");
  }
}
