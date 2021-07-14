package edabit.medium;

//Recursion: Array Sum
//
//        Write a function that finds the sum of an array. Make your function recursive.
//        Examples
//
//        sum([1, 2, 3, 4]) ➞ 10
//
//        sum([1, 2]) ➞ 3
//
//        sum([1]) ➞ 1
//
//        sum([]) ➞ 0
//
//        Notes
//
//        Return 0 for an empty array.
//        Check the Resources tab for info on recursion.

import java.util.Scanner;

public class RecursionArraySum {



    public static  int sum(int ar[],int i,int n)
    {
        if(i==n)
        {
            return 0;
        }

        return ar[i]+sum(ar,i+1,n);
    }

    public  static  void  main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the element in the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("SUm of the array element is  "+sum(arr,0,n));


    }
}
