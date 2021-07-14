package edabit.medium;

//Find the Other Two Side Lengths
//
//        Given the shortest side of a 30° by 60° by 90° triangle you have to find out the other 2 sides, (return the longest side, medium-length side).
//        Examples
//
//        otherSides(1) ➞ [2.0, 1.73]
//
//        otherSides(12) ➞ [24.0, 20.0]
//
//        otherSides(2) ➞ [4.0, 3.46]
//
//        otherSides(3) ➞ [6.0, 5.2]
//
//        Notes
//
//        30° by 60° by 90° triangles always follow this rule, let's say the shortest side length is x units, the hypotenuse would be 2x units and the other side would be x * square root of 3 units.
//        The results in the Tests are rounded up to 2 decimal places.
//        Return the result as an array.


import java.util.Scanner;

public class OtherSideLength {


    public static void OtherTwoSides(int number)
    {
       double b=number*2;

       double c=Math.sqrt(Math.abs(number*number-b*b));

        System.out.print("the two number is  "+b+" and ");
        System.out.printf("%.2f", c);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

        int number= scanner.nextInt();
        OtherTwoSides(number);



    }
}
