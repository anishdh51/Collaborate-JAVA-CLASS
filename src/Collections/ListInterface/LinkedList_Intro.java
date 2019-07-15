package Collections.ListInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Intro {

    public static void main(String[] args) throws InterruptedException{

        LinkedList<Integer> numList = new LinkedList<Integer>(Arrays.asList(34,56,5,67,87,97));

        System.out.println("numList");
      // ==================MAKE IT THREAD SAFE: ==============

        Collections.synchronizedCollection(numList);

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {


                Iterator<Integer>iterator=numList.iterator();
                while (iterator.hasNext()){
                   try{
                       Thread.sleep(1500);
                   }catch(InterruptedException e){

                    }
                    System.out.println("This is threadOne"+ iterator.next());
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {


                Iterator<Integer>iterator=numList.iterator();
                while (iterator.hasNext()){
                    try{
                        Thread.sleep(1500);
                    }catch(InterruptedException e){

                    }
                    System.out.println("This is ThreadTwo" + iterator.next());
                }
            }
        });


        threadOne.start();
        threadTwo.start();
    }



}
