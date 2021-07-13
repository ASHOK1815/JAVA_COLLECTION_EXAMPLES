package edabit;

//Are the Numbers Equal?
//
//        Create a function that returns true when x is equal to y; otherwise return false.
//        Examples
//
//        isSameNum(4, 8) ➞ false
//
//        isSameNum(2, 2) ➞  true
//
//        isSameNum(42, 32) ➞  false
import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int numberOne=scanner.nextInt();
        int numeberTwo=scanner.nextInt();

        if(numberOne==numeberTwo)
        {
            System.out.println("NUmber are equal ");
        }
        else
        {
            System.out.println("NUmber are not equal ");
        }



    }
}
