package Collections.ListInterface;


import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class List_Methods {


    public static void main(String[] args) {

        // TODO: 7/11/2019
        /*
        ArrayList add() method example
        ArrayList addAll() method example
        ArrayList clear() method example
        ArrayList clone() – How to clone an ArrayList
        ArrayList contains() method example
        ArrayList ensureCapacity() method example
        ArrayList forEach() method example
        ArrayList get() method example
        ArrayList indexOf() method example
        ArrayList lastIndexOf() method example
        ArrayList listIterator() method example
        ArrayList remove() method example
        ArrayList removeAll() method example
        ArrayList retainAll() method example
        ArrayList replaceAll() method example
        ArrayList removeIf() method example
        ArrayList sort() method example
        ArrayList spliterator() method example
        ArrayList subList() method example
        ArrayList toArray() method example
         */
        ArrayList<String> list = new ArrayList<>();

        list.add("JAMES");
        list.add("JOHN");
        list.add("ROBERT");
        list.add("MICHAEL");
        list.add("DAVID");
        list.add("OLIVIA");
        list.add("EMILY");
        list.add("JAMES");
        list.add("SOPHIA");
        list.add("MIA");

        System.out.println(list);

        // ArrayList addALL() method example
        // add All method will another list into same list

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Oliver");
        nameList.add("Ava");
        nameList.add("Emma");

        list.addAll(nameList);
        System.out.println(list);

        // ArrayList Clear () method example
        //list.clear();
        //System.out.println(list);

        // ArrayList Clone () - How to clone an Array List
        // Copy the existing list and create another list.

        ArrayList<String> templist = (ArrayList<String>)list.clone();
        System.out.println("++++++This is Temp List ++++++");
        System.out.println(templist);


        // ArrayList Contains() method example
        // it return the boolean value

        boolean nameCheck = list.contains("Emmma");
        System.out.println(nameCheck);

        // ArrayList ensureCapacity() method example:

        list.ensureCapacity(40);

        // ArrayList forEach() method example :
        list.forEach(name -> System.out.println(name.toLowerCase()));
        list.forEach(name -> System.out.println(name.toUpperCase()));

        // ArrayList get() method example:

        System.out.println("++++++This is GET METHOD List ++++++");
        System.out.println(list.get(5));

        //  ArrayList indexOf() method example:

        System.out.println(list.indexOf("MIA"));

        // ArrayList lastIndexOf() method example:
        System.out.println(list.lastIndexOf("MIA"));

        // ArrayList listIterator() method example

        ListIterator<String> listIterator = list.listIterator();
        System.out.println("++++PRINT OF LIST FORWARD");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        System.out.println("++++PRINT OF LIST BACKWARD");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // ArrayList remove() method example:
        // remove specific element from the list

        System.out.println("==== REMOVE METHOD ====");
        list.remove("MIA");
        System.out.println(list);

        // ArrayList removeAll() method example:

        System.out.println("==== REMOVE ALL METHOD ====");

        list.removeAll(Collections.singleton("DAVID"));

        System.out.println(list);


        // ArrayList retainALL() method example:
        ArrayList<String> alphabets = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));

        System.out.println("==== ALPHABETS LIST =====");
        System.out.println(alphabets);

        alphabets.retainAll(Collections.singleton("A"));
        System.out.println(alphabets);

        // ArrayList replaceAll() method example:

        alphabets.replaceAll(e -> e.toLowerCase());
        System.out.println(alphabets);

        // ArrayList removeIf() method example:
        // based on some condition

        list.removeIf(n -> n.startsWith("J"));
        System.out.println(list);

        // ArrayList sort() method example:

        System.out.println("==== SORt LIST =====");
        Collections.sort(list);
        System.out.println(list);

        //   ArrayList splitter() method example


        ArrayList<Integer> numebers = new ArrayList <Integer> (Arrays.asList(2,2,5,4,6,7,8,9,7,8,8));

        System.out.println("===== NUMBER LIST====== ");
        System.out.println(numebers);

        Spliterator<Integer> spliterator = numebers.spliterator();

        spliterator.tryAdvance(num -> System.out.println(num));
        spliterator.tryAdvance(num -> System.out.println(num));
        spliterator.tryAdvance(num -> System.out.println(num));
        spliterator.tryAdvance(num -> System.out.println(num));

        //   ArrayList subList() method example
        ArrayList<Integer> subListOne = new ArrayList <Integer> (Arrays.asList(2,2,5,4,6,7));
        ArrayList<Integer> subListTwo = new ArrayList <Integer> (Arrays.asList(2,2,5,4,6,7));

        System.out.println(subListOne);
        System.out.println(subListTwo);

        System.out.println(subListOne.subList(2,5));


        //   ArrayList toArray() method example

        ArrayList<Integer> tlist = new ArrayList<>();
        tlist.add(12);
        tlist.add(22);
        tlist.add(34);
        tlist.add(23);
        System.out.println(tlist);

        Integer arr[] = tlist.toArray(new Integer[tlist.size()]) ;
        System.out.println(Arrays.toString(arr));


    }
}
