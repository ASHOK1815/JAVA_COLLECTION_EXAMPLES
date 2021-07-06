import java.util.Scanner;

public class ClassLoaderSubSystem {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        //classLoaderSubSystem  is loaded by application subsystem
        System.out.println(ClassLoaderSubSystem.class.getClassLoader());

        Scanner scan=new Scanner(System.in);
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
