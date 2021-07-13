package edabit;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//Return the Sum of Two Numbers
//
//        Create a method that takes two integers as arguments and return their sum.
//        Examples
//
//        SumOfTwoNumbers(3, 2) ➞ 5
//
//        SumOfTwoNumbers(-3, -6) ➞ -9
//
//        SumOfTwoNumbers(7, 3) ➞ 10
//
//        Notes
//
//        Don't forget to return the result.
//        If you get stuck on a challenge, find help in the Resources tab.
//        If you're really stuck, unlock solutions in the Solutions tab.
public class Sum {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int numberOne=scan.nextInt();
        int numberTwo=scan.nextInt();

        numberOne+=numberTwo;
        System.out.println("the sum of the number is  "+numberOne);
    }
}
