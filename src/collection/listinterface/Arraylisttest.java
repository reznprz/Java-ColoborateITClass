package collection.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylisttest {

    public static void main(String[] args) {

        ArrayList<String> colorlist = new ArrayList<>();
        //add 5 colors

        colorlist.add("Blue");
        colorlist.add("White");
        colorlist.add("Green");
        colorlist.add("Red");
        colorlist.add("Yellow");

        // print the list with iterator class.

        Iterator<String> newcolor = colorlist.iterator();  //ask ask ask
        while (newcolor.hasNext()){
            System.out.println(newcolor.next());
        }

        //1st element of the list
        System.out.println(colorlist.get(0));

        //index of the red color

        System.out.println(colorlist.indexOf("Red"));

        //update orange in red position

        colorlist.set(3,"Orange");
        System.out.println(colorlist);

        //remove the 4 the element
        colorlist.remove(4);
        System.out.println(colorlist);

        //sort list

        Collections.sort(colorlist);
        System.out.println(colorlist);


        //copy one list to another list

        ArrayList<String> colorlist2 = new ArrayList<>();

        colorlist2.add("Black");
        colorlist2.add("Silver");
        colorlist2.add("Tan");

        colorlist.addAll(colorlist2);
        System.out.println(colorlist);

        //print color in reverse order

        Collections.reverse(colorlist);
        System.out.println(colorlist);

        //check the capacity and size of the list.

//        Integer numm = colorlist.ensureCapacity(40);
//        System.out.println();

        //empty the list

       // colorlist.clear();
        System.out.println(colorlist);
        System.out.println(colorlist.size());

        //implement the remove all

        colorlist.removeAll((Collections.singleton("Tan")));
        System.out.println(colorlist);

        //conver the array list into the array


        String arr[] = colorlist.toArray(new String[colorlist.size()]);
        System.out.println(Arrays.toString(arr));

        //add in arr

        arr[5] = "Pink";

        System.out.println(Arrays.toString(arr));











    }
}
