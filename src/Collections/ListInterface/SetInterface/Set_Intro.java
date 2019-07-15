package Collections.ListInterface.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Intro {

    public static void main(String[] args) {



        Set<Integer> numList = new HashSet<>();
        numList.add(23);
        numList.add(34);
        numList.add(23);
        numList.add(67);
        numList.add(45);

        System.out.println(numList);

        // It does not allow duplicate
        // Hashset will not provide any order

        // TreeSet will provide ascending order
        Set<Integer> integers = new TreeSet<>(numList);
        System.out.println(integers);

    }




}
