/*int a = 10;
 int b = 10;
 if(a==b){
 println("succes!");
 }else{println("failure");}*/

int x = 12;
int y = 11;
int z = 7;
if (x+y+z==30) {
  if (x==10 || x==20 || x==30)
    println("Failure!");
  else if (y==10 || y==20 || y==30)
    println("Failure!");
  else if (z==10 || z==20 || z==30)
    println("Failure!");
  else {
    println("Succes!");
  }
} else {
  println("Failure!");
}
