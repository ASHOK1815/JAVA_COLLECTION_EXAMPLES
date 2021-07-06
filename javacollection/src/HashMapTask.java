
import java.util.HashMap;
public class HashMapTask {

    public static void main(String[] args) {

      HashMap<String,Integer> map=new HashMap<String,Integer>();

      map.put("Ashok",6735);
      map.put("Sunil",2467);
      map.put("Javed",6705);
      map.put("Ashutosh",6721);
      map.put("Happy",6714);

      //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        for(String i: map.keySet())
        {
            System.out.println(i);
        }



        // using of the values;

        for(Integer i:map.values())
        {
            System.out.println(i);
        }

        // accessing both the the key and values

        for(String s: map.keySet())
        {
            System.out.println(s+"   "+map.get(s));
        }



    }
}
