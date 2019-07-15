package Collections.ListInterface.MapInterface;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapInterface {

    public static void main(String[] args) {

        Map<Integer, Person> map3 = new HashMap<>();
        map3.put(1, new Person((long) 11,"John",new Date(),"407 Village road"));
        map3.put(2, new Person((long) 22,"Rowan",new Date(),"10 Village road"));
        map3.put(3, new Person((long) 33,"Global",new Date(),"33 Village road"));

        // Using Setter
        Person p1 = new Person();
        p1.setPersonID((long) 12);
        p1.setName("Harry");
        p1.setPersonDOB();
        p1.setAddress("10 Main Street");
        map3.put(4, p1);

        System.out.println(map3);

        // Remove

        map3.remove(2);
        System.out.printf("====Removed 2 ====");
        System.out.println(map3);

        // Clone
        Map<Integer,Person> map4 = new HashMap<>(map3);
        System.out.println("==== Clone ===");
        System.out.print(map4);

        // Contain Key
        boolean b1 = map4.containsKey(2); // checking if its there or not
        System.out.printf(String.valueOf(b1));

        // Loop using key / value pair

        Iterator<Map.Entry<Integer,Person>> mapiterator = map4.entrySet().iterator();
        while (mapiterator.hasNext()){

            Map.Entry<Integer,Person> map6 = mapiterator.next();
            System.out.println(map6);
        }



    }



}
