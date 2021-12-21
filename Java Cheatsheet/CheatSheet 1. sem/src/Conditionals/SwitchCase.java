package Conditionals;

public class SwitchCase {

    //Switch cases bruges til at vælge en specifik variabel i en større kodeblok. Se eksempel 1
    //Break bruges til at komme ud af et switch/loop statement. Se eksempel 2
    //Continue statement springer en iteration(runde) over i loopet, hvis en specifik præmis opstår, og forsætter derefter videre med loopet.

    //Eksempel 1
    int day = 4;
switch(day)

    {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("It's neither weekday or weekend.. It's doomsday!");
            //Output is "thursday"
    }
for(int i = 0;i< 10;i++){
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }
for(int i = 0; i < 10; i++) {
        if (i == 4) {
            continue;
        }
        System.out.println(i);
    }
}

