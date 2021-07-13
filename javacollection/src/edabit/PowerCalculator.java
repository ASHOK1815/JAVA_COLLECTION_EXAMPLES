package edabit;


//Power Calculator
//
//        Create a function that takes voltage and current and returns the calculated power.

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int voltage=scan.nextInt();
        int current=scan.nextInt();

        voltage=voltage*current;
        System.out.println("The calculated power is  "+voltage);


    }
}
