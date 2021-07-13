package edabit.medium;

//War of Numbers
//
//        There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. You have to determine which group sums larger: the even, or the odd. The larger group wins.
//
//        Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between sum of even and odd numbers.
//        Examples
//
//        warOfNumbers([2, 8, 7, 5]) ➞ 2
//// 2 + 8 = 10
//// 7 + 5 = 12
//// 12 is larger than 10
//// So we return 12 - 10 = 2
//
//        warOfNumbers([12, 90, 75]) ➞ 27
//
//        warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168

import java.util.Scanner;

public class WarOfNumber {

    public static  void  main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements ");

        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evenSum+=arr[i];
            }
            else
            {
                oddSum+=arr[i];
            }
        }

        System.out.println("THE DIFFERNCE OF SUM OF EVEN AND ODD NUMBER IS " + Math.abs(evenSum-oddSum));


    }
}
