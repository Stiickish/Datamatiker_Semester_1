int count =1;

void setup () {
  size(600, 600);
  background(255);
  frameRate(2);
  
}

void draw() {
  //background(255);
  rectMode(CENTER);
  ellipseMode(CENTER);
  color red = color(255, 0, 0, 50);
  color yellow = color(255, 240, 0, 50);
  color green = color(0, 255, 0, 50);
  color gray = color(0, 0, 0, 50);
  


  /*fill(255);//lyskryds
  rect(350, 225, 125, 275); //lyskryds
  fill(red); // lys 1 farve
  ellipse(350, 140, 75, 75); //lys 1
  fill(yellow); //lys 2 farve
  ellipse(350, 225, 75, 75); //lys 2
  fill(green); //lys 3 farve
  ellipse(350, 310, 75, 75); //lys 3*/

println(count);
  if (count % 2 ==0) {
    fill(255);
    rect(350, 225, 125, 275);
    fill(gray);
    ellipse(350, 140, 75, 75);
    fill(yellow);
    ellipse(350, 225, 75, 75);
    fill(green);
    ellipse(350, 310, 75, 75);
    count++;
  } else {
 
  fill(255);
  rect(350, 225, 125, 275);
  fill(red);
  ellipse(350, 140, 75, 75);
  fill(yellow);
  ellipse(350, 225, 75, 75);
  fill(gray);
  ellipse(350, 310, 75, 75);
  count++;
}
}
