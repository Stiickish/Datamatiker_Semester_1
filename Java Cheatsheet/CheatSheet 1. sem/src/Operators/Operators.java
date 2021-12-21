package Operators;

public class Operators {

    public static void main(String[] args) {

        /* Man kan bruge forskellige operators til at få programmet til at udføre forskellige opgaver
        herunder matematik
         */

                //Arithmetic Operators
       /* ++          //
        --          //
        *           //
        +           //
        /           //
        %           //
        -           //

                //Assignment operators
        =           //Equal to // x = 5;
        +=          //x += 3 // x = x + 3;
        -=          //x -= 3 // x = x - 3;
        *=          //x *= 3 // x = x * 3;
        /=          //x /= 3 // x = x / 3;
        %=          //x %= 3 // x = x % 3; // Modulus tager KUN resten
        &=          //x &= 3 // x = x & 3; // ?????????
        |=          //x |= 3 // x = x | 3; // ?????????
        ^=          //x ^= 3 // x = x ^ 3;
        >>=         //x >>= 3 // x = x>>3; //?????????
        <<=         //x <<= 3 // x = x<<3; //?????????

                //Comparison operators
        ==          //Equal to // x == y
        !=          //Not equal to // x != y
        <           //Less than // x < y
        >           //Greater than // x > y
        <=          //Less than or equal to // x <= y
        >=          //Greater than or equal to // x >= y

                //Logical operators
        &&          //Returns true if both statements are true // x < 5 && x < 10
        ||          //Returns true if one of the statements is true // x < 5 || x < 4
        !           //Logical not reverse the result, returns false if the result is true // !( x < 5 && x < 10)

*/
        // Eksempel på logical operators
        int x = 10;
        boolean isHappy = true;
        if(x == 10 && isHappy){
            System.out.println("Both is true");
        }
        int x1 = 10;
        boolean isHappy1 = false;
        if(x1 ==10 && !isHappy1){
            System.out.println("Both statements is 'true'");// begge er true da hele statmentet vil returnere true fordi vi spørger NOT isHappy1
        }
        int x2 = 10;
        boolean isHappy2 = false;
        if(x2 ==10 || isHappy2){
            System.out.println("One of the statements is true.... But which one?... Bum bum bum... ");
        }
    }

}
