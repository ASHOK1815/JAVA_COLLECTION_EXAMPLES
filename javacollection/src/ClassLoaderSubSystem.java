import java.util.Scanner;

public class ClassLoaderSubSystem {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        //classLoaderSubSystem  is loaded by application subsystem
        System.out.println(ClassLoaderSubSystem.class.getClassLoader());

        Scanner scan=new Scanner(System.in);


        int number=99;
        System.out.println((char)number);// converting number to char


        // programme to reverse the element
        int value=1234;
        int ans=0;
        while(value!=0)
        {
            ans=ans*10+value%10;
            value=value/10;

        }

        System.out.println(ans);


       // finding prime number between 23 to 57
        boolean flag;
        for(int i=23;i<=57;i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(i);
            }

        }


        // Small programme to check whether person able to vote or not
        int age;
        char ch;
        do{

          System.out.println("Enter the age");
          age=scan.nextInt();

          if(age>18)
          {
              System.out.println("You can vote");
          }
          else
          {
              System.out.println("You age is below 18 ,you cannot vote");
              System.out.println("Come when ");
          }
          System.out.println("Do you want to continue .... Press Y else anydigit to quiet");
          ch=scan.next().charAt(0);


        }while(ch=='Y' || ch=='y');


    }


}
