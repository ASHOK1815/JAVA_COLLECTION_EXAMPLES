

import java.util.ArrayList;

import java.util.Collections;

public class ArrayListTask {

    public static void main(String[] args) {

        // define the arraylist
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        // adding 0-3 to the arrayList
       for(int i=0;i<4;i++)
       {
           arrayList.add(i);
       }
       //setting the particular index 19
       arrayList.set(0,19);

       // removing the element from the index 0;
       arrayList.remove(0);

       // collection class having sort method to sort the list
       Collections.sort(arrayList);

       // looping through the all the element from the arraylist
       for(int i :arrayList)
       {
           System.out.println(i);
       }



    }
}
