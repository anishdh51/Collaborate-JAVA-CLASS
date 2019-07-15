package Collections.ListInterface.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {

        // HashMap Declaration
        Map<Integer, String > map = new HashMap<>();

        // Add the data
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        System.out.println(map);

        // read the specific data set
        String value = map.get(2);
        System.out.println("This is the value of key :" + value);

        // remove the data
        map.remove( 3);
        System.out.println("===Remove Method====");
        System.out.println(map);

        // How to loop Hashmap
        // Loop via key only

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
 Integer key = iterator.next();
String valueOne = map.get(key);
            System.out.println("This is key:" + key+"  add value is:"+ valueOne);
    }

    // Loop Via Key and value both

    Iterator<Map.Entry<Integer,String>> entryIterator = map.entrySet().iterator();
    while (entryIterator.hasNext()){
    Map.Entry<Integer,String> entry = entryIterator.next();
    System.out.println("This is Key:"+ entry.getKey()+"This is value:"+entry.getValue());
    }

/*
 1. One HashMap with k = Float type and value long
 2. Add the data
 3. Remove one entry
 4. Loop via key and key/value
 */

    Map<Float,Long> numMap = new HashMap<>();
    numMap.put(1.2F, 3L);
        System.out.println(numMap);

    numMap.put(1.5F,1L);
    numMap.put(5.9F, 9L);
        System.out.println(numMap);

    numMap.remove(1.2F, 3L);
        System.out.printf("Remove===Method==");
        System.out.println(numMap);

    //Iterator<numMap.Entry<Float,Long>> entryIterator1 = numMap.entrySet().iterator();
    //while (entryIterator.hasNext()){
    //numMap.Entry<Float,Long> entry = entryIterator.next();
        //System.out.println(entry);
}


}