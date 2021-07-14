package edabit.medium;

import java.util.Scanner;

//The challenge is to fix all of the bugs in this incredibly messy code, which the code in the image might've actually looked like (probably not)! The code given will output the same middle two lines as in the image shown above.
//
//        First parameter is the user's score.
//        Second parameter is the required score.
//
//        Examples
//
//        grade_percentage("85%", "85%") ➞ "You PASSED the Exam"
//
//        grade_percentage("99%", "85%") ➞ "You PASSED the Exam"
//
//        grade_percentage("65%", "90%") ➞ "You FAILED the Exam"
public class FailedPassed {

    public static String gradePercentage(String userScore, String passScore){
        String s = "";
        //System.out.println(Integer.parseInt(userScore.substring(0,userScore.length()-1)));
        if (Integer.parseInt(userScore.substring(0,userScore.length()-1)) < Integer.parseInt(passScore.substring(0,passScore.length()-1))){
            s += "FAILED";
        }
        else if (Integer.parseInt(userScore.substring(0,userScore.length()-1)) >= Integer.parseInt(passScore.substring(0,passScore.length()-1))){
            s += "PASSED";
        }

        return "You " + s + " the Exam";
    }

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the userScore and the passScore");
        String userScore = scanner.next();
        String passScore = scanner.next();

        System.out.println(gradePercentage(userScore,passScore));
    }
}
