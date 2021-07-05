import java.util.HashSet;

public class HashSetTask {

    public static void main(String[] args) {

        //hash set dont allow duplicate
        HashSet<Integer> set=new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(2);

       // contain method check that whether that element present in set or not
        if(set. contains(5))
        {
            System.out.println("it contains 5");
        }

        set.remove(5);// remove the element from the set

        if(!set.contains(5))
        {
            System.out.println("5 not presented");
        }


        for(Integer i:set)
        {
            System.out.println(i);
        }



    }


}
