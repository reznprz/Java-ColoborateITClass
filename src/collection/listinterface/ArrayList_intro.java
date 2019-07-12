package collection.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_intro {

    public static void main(String[] args) {

        //List declaration
        List<String> nameList = new ArrayList<>();
        //another way class declaration
       // ArrayList<String> list = new ArrayList<>();

        System.out.println(nameList);
        nameList.add("John");
        nameList.add("sam");
        nameList.add("ram");
        nameList.add("Mike");
        System.out.println(nameList);
        //print array in sperate line.

        //Read the list with for loop.
        System.out.println("============ Using FOR LOOP ==============");
        for(int i = 0; i < nameList.size(); i++){
            if(nameList.get(i).equals("ram")){
                System.out.println("this is ram ");
            }
            System.out.println(nameList.get(i));
        }
        //another way.

        //using iterator class
        Iterator<String> iterator = nameList.iterator();

        System.out.println("============ Using Iterator class ==============");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
