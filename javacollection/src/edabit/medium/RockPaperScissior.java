package edabit.medium;

//Simulate the Game "Rock, Paper, Scissors"
//
//        Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
//
//        "Player 1 wins"
//        "Player 2 wins"
//        "TIE" (if both inputs are the same)
//
//        The rules of rock, paper, scissors, if not known:
//
//        Both players have to say either "rock", "paper" or "scissors" at the same time.
//        Rock beats scissors, paper beats rock, scissors beat paper.
//
//        Examples
//
//        rps("rock", "paper") ➞ "Player 2 wins"
//
//        rps("paper", "rock") ➞ "Player 1 wins"
//
//        rps("paper", "scissors") ➞ "Player 2 wins"
//
//        rps("scissors", "scissors") ➞ "TIE"
//
//        rps("scissors", "paper") ➞ "Player 1 wins"

import java.util.Scanner;

public class RockPaperScissior {


    public static String rps(String s1, String s2) {

         if(s1.equals(s2))
         {
             return "TIE";
         }
         else if(s1.equals("paper") && s2.equals("rock"))
         {
             return "Player 1 wins";
         }
         else if(s1.equals("rock") && s2.equals("scissiors"))
         {
             return "Player 1 wins";
         }
         else if(s1.equals("scissiors")  && s2.equals("paper"))
         {
             return "PLayer 1 wins";
         }


         return "Player 2 wins";

    }

    public static void  main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER THE FIRST STRING ");
        String firstString =scanner.next();
        System.out.println("ENTER THE SECOND STRING ");
        String secondtString =scanner.next();


        System.out.println(rps(firstString,secondtString));




    }
}
