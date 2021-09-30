DiceCup cupDice = new DiceCup();



void setup() {                          //Our setup runs once
  size(1600, 600);                      //Window size
  background(255);                      //Background colour sets to white
  rectMode(CENTER);
}


void draw() {                           //Draw is empty. Nothing needs to run continually.
}

void keyPressed() {                      //We add keyPressed function for adding and random our dices
  if (key=='a') {
    cupDice.addDie();
    cupDice.shake();
  }
  if (key=='b') {
    cupDice.shake();
  }
}


class Die {                             //our class "Die" for dice
  color eyeColor;                       //Colour on the dice eyes 
  color dieColor;                       //Colour on the dice
  int eyes;                             //Declaring our int with eyes

  public Die(color eyeColor, color dieColor) {    // Our constructor for Die
    this.eyeColor = eyeColor;                    //"This" keyword is used for reference
    this.dieColor = dieColor;                    //"This" keyword is used for reference
  }

  public int roll() {                        //Our method to make the dice roll random
    eyes = (int)random(1, 7);
    return eyes;
  }

  public void draw(int x, int y, int size) {    //Making our die with x, y pos and size
    rect(x, y, size, size, 30);                  //Rectangle in x,y pos and size - 10 for curve edges
    fill(dieColor);                              //Die color
    fill(eyeColor);                              //Die eyes color


    switch(eyes) {                                //Switch(loop) for our die
    case 1:
      circle(x, y, 15);
      break;
    case 2:
      circle(x-(size/4), y-(size/4), 15);
      circle(x+(size/4), y+(size/4), 15);
      break;
    case 3:
      circle(x-(size/4), y-(size/4), 15);
      circle(x+(size/4), y+(size/4), 15);
      circle(x, y, 15);
      break;
    case 4:
      circle(x-(size/4), y-(size/4), 15);
      circle(x+(size/4), y+(size/4), 15);
      circle(x+(size/4), y-(size/4), 15);
      circle(x-(size/4), y+(size/4), 15);
      break;
    case 5: 
      circle(x-(size/4), y-(size/4), 15);
      circle(x+(size/4), y+(size/4), 15);
      circle(x+(size/4), y-(size/4), 15);
      circle(x-(size/4), y+(size/4), 15);
      circle(x, y, 15);
      break;
    case 6:
      circle(x-(size/4), y-(size/4), 15);
      circle(x+(size/4), y+(size/4), 15);
      circle(x+(size/4), y-(size/4), 15);
      circle(x-(size/4), y+(size/4), 15);
      circle(x, y-(size/4), 15);
      circle(x, y+(size/4), 15);
      break;
    }
  }
}
class DiceCup {                        //Our new class for our dicecup
  int pos=0;                            //position 0
  Die[] dice=new Die[50];               //Array with 10 dices in it


  public void DiceCup() {                          //Our constructor for our dicecup
  }

  public void addDie() {                             //Our method for adding dices
    dice[pos]=new Die((int)random(160, 255), (int)random(0, 255));      //Adding in pos 0 with random colors
    pos++;                                          //Adding +1 to pos
  }

  public void shake() {                            //Our method to shake the cup
    for (int i=0; i<dice.length; i++ ) {              //For loop
      if (dice[i]!=null) {                              //if dice I is not equal to i
        dice[i].roll();                                  //roll
      }
    }
    Draw(60, 60, 100);
  }
  void Draw (int x, int y, int dieSize) {          //Our method to draw all dices on 1 line
    int xPos=x;                                     // Calling a variabel to draw it at pos x

    for (int i=0; i<cupDice.dice.length; i++ ) {      //For loop
      if (cupDice.dice[i]!=null) {                      //if cup + dices is not equal to i
        cupDice.dice[i].draw(xPos, y, dieSize);         //Draw dices in xPos linear 
        xPos = xPos+dieSize+(dieSize/2);                //Draw dices with half a die size inbetween
      }
    }
  }
}
