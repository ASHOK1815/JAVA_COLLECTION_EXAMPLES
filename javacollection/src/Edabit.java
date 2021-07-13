
/*Return the Next Number from the Integer Passed
        Create a function that takes a number as an argument, increments the number by +1 and returns the result.*/

import java.util.Scanner;
public class Edabit {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        number+=1;

        System.out.println("the next number is  "+number);


    }
}
