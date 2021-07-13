//Perfect Square Patch
//
//        Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
//        Examples
//
//        squarePatch(3) ➞ [
//        [3, 3, 3],
//        [3, 3, 3],
//        [3, 3, 3]
//        ]
//
//        squarePatch(5) ➞ [
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5],
//        [5, 5, 5, 5, 5]
//        ]
//
//        squarePatch(1) ➞ [
//        [1]
//        ]
//
//        squarePatch(0) ➞ []

package edabit.medium;

import java.util.Scanner;

public class PerfectSquarePatch {

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=n;
            }
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
