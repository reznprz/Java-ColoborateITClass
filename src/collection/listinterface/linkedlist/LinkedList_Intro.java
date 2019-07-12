package collection.listinterface.linkedlist;

import java.util.*;

public class LinkedList_Intro {

    public static void main(String[] args) {

        LinkedList<Integer> numlist = new LinkedList<Integer>(Arrays.asList(33,55,676,323,546454,434));

        System.out.println(numlist);

        //to be thread save  OR make it thread save

        Collections.synchronizedCollection(numlist);

        Thread threadone = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = numlist.iterator();
                while (iterator.hasNext()){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("this is thread one " + iterator.next());
                }
            }
        });

        Thread threadtwo = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = numlist.iterator();
                while (iterator.hasNext()){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("this is thread two " + iterator.next());
                }
            }
        });

        threadone.start();
        threadtwo.start();
    }


}
