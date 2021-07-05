
import java.net.StandardSocketOptions;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {

    public static void main(String[] args) {


       // declaring the list
       LinkedList<String> list=new LinkedList<String>();

       //adding the data to the list
       list.add("Ashok");
       list.add("Sunil");
       list.add("Ashutosh sharma");


       //adding happy to the end of the list
       list.addLast("Happy");

       //adding vashist to the first to the list
       list.addFirst("vashist");

       // removing first element from the list
        // it remove vahist from the list as it is the first element in the list
        list.removeFirst();

        //removing the last element from the list

        list.removeLast();

        // this will add element at the index in the list
        list.add(2,"JADOOO");


        // using the iterator interface
        Iterator it=list.listIterator();
//
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }


        // iterator used to remove element from the list
        while(it.hasNext())
        {

            String value=(String) it.next();
//            System.out.println("value " +value);
            if(value.equals("Ashok"))
            {

                it.remove();

            }

        }


         //second way of iteating the list
        for(String c:list)
       {
           System.out.println(c);
       }

    }
}
