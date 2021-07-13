package edabit;

/*Convert Minutes into Seconds

        Write a function that takes an integer minutes and converts it to seconds.
        Examples

        convert(5) ➞ 300

        convert(3) ➞ 180

        convert(2) ➞ 120

        Notes

        Don't forget to return the result.
        If you get stuck on a challenge, find help in the Resources tab.
        If you're really stuck, unlock solutions in the Solutions tab.*/

import java.util.Scanner;

public class MinuteToSecond {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int minute=scan.nextInt();

        int second=minute*60;

        System.out.println("the minute in second is  "+second);

    }
}
