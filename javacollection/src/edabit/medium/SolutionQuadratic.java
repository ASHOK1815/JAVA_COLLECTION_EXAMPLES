package edabit.medium;

//How Many Solutions Does This Quadratic Have?
//
//        A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.
//        Examples
//
//        solutions(1, 0, -1) ➞ 2
//// x² - 1 = 0 has two solutions (x = 1 and x = -1).
//
//        solutions(1, 0, 0) ➞ 1
//// x² = 0 has one solution (x = 0).
//
//        solutions(1, 0, 1) ➞ 0
//// x² + 1 = 0 has no real solutions.
//
//        Notes
//
//        You do not have to calculate the solutions, just return how many there are.
//        a will always be non-zero.

import java.util.Scanner;
import java.lang.Math;
public class SolutionQuadratic {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int d=b*b-4*a*c;

        try
        {
            if(d<0)
            {
                throw new ArithmeticException("Has no real solution");

            }
            double x=((-b)+Math.sqrt(d))/2*a;
            double x1=((-b)-Math.sqrt(d))/2*a;
            if(x==x1)
            {
                System.out.println("has one solution "+(int)(x));
            }
            else
            {
                System.out.println("has two solution  "+(int)x+" and "+(int)x1);
            }

        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }







    }
}
