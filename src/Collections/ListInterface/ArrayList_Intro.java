package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Intro {


    public static void main(String[] args) {

        // List Declaration

        List<String> nameList = new ArrayList<>();

        System.out.println(nameList);


        nameList.add("John");
        nameList.add("Johhn");
        nameList.add("Johhhn");
        nameList.add("Johhhhn");

        System.out.println(nameList);

        // Read the List with for  Loop

        for ( int i = 0; i<nameList.size();i++){

            if(nameList.get(i).equals("John")){

                System.out.println("THIS IS JOH+SH");
            }

            System.out.println(nameList.get(i));


            //Using Iterator Class

            Iterator<String> iterator = nameList.iterator();
            System.out.println("++++++++USING ITERATOR CLASS++++++++++++++++++");
            while (iterator.hasNext()){

                System.out.println(iterator.next());
            }
        }


    }
}
