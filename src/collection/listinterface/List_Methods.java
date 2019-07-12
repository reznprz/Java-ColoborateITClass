package collection.listinterface;

import java.util.*;
import java.util.function.Predicate;

public class List_Methods {

    public static void main(String[] args) {
        //TODO: 2019-07-11
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



        System.out.println("====this new arraylist======" + "\n");

        ArrayList<String> list = new ArrayList<>();
        //ArrayList add() method example
        list.add("JAMES");
        list.add("JOHN");
        list.add("ROBERT");
        list.add("MICHAEL");
        list.add("DAVID");
        list.add("OLIVIA");
        list.add("EMILY");
        list.add("SHPHIA");
        list.add("MIA");
        System.out.println(list);

        // ArrayList addAll() method example
        // add All method will add another list into same list
        // has to be same datatype.
       // System.out.println("====this new arraylist with addall method====== + \"\\n\"");


        ArrayList<String> namelist = new ArrayList<>();
        namelist.add("Oliver");
        namelist.add("Ava");
        namelist.add("Emma");
        list.addAll(namelist);//add all the list listed in namelist to the list arraylist.
        System.out.println("this is list after adding oliver ava and emma  + \"\\n\"");
        System.out.println(list);

        //ArrayList clone() – How to clone an ArrayList
        //copy one list and create anotherlist.

        ArrayList<String> templist = (ArrayList<String>)list.clone();
        System.out.println("====this is temp list======");
        System.out.println(templist);

       // ArrayList contains() method example
        //check the certain element in array
        //its return the boolean value.

        boolean namecheck = list.contains("Emma");
        System.out.println(namecheck);

        // ArrayList ensureCapacity() method example
        list.ensureCapacity(40);

        //ArrayList forEach() method example
        // here name is varibale....
        list.forEach(name -> System.out.println(name.toLowerCase()));
        list.forEach(n -> System.out.println(n.toUpperCase()));

        //ArrayList get() method example
        //simple read method.
        System.out.println("====this is getmethod from list======");
        System.out.println(list.get(2));

        //ArrayList indexOf() method example
        System.out.println(list.indexOf("MIA"));

        //ArrayList lastIndexOf() method example
        System.out.println(list.lastIndexOf("DAVID"));

        //ArrayList listIterator() method example
        ListIterator<String> listIterator = list.listIterator(); // ask ask ask TODO

        System.out.println("=== Print the list forward=====");

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        System.out.println("=== Print the list backward=====");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // ArrayList remove() method example
        // remove specific element from the list

        System.out.println("=== remove method=====");
        list.remove("OLIVIA");
        System.out.println(list);

        //ArrayList removeAll() method example
        //remove all the element named david
        System.out.println("=== remove all method=====");
        list.removeAll(Collections.singleton("DAVID"));
        System.out.println(list);

        // ArrayList retainAll() method example
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("A","B","A","D","C","F"));
        System.out.println(" ==== Alphabets List =====");
        System.out.println(alphabet);

        alphabet.retainAll(Collections.singleton("A"));
        System.out.println(alphabet);

        //ArrayList replaceAll() method example
        alphabet.replaceAll(e ->e.toLowerCase());
        System.out.println(alphabet);

        //ArrayList removeIf() method example
        //based on some condition
        System.out.println(" ==== removedif method List =====");
        list.removeIf(n -> n.startsWith("J"));
        System.out.println(list);

        System.out.println(" ==== sort the name  method List =====");

        //ArrayList sort() method example
        //
        Collections.sort(list);
        System.out.println(list);

        //ArrayList spliterator() method example

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,5,5,6,9,8,3));
        System.out.println("------------NUMBER LIST---------");
        System.out.println(numbers);

        Spliterator<Integer> spliterator = numbers.spliterator();
        //check before printing out is there element or not.

        spliterator.tryAdvance(num -> System.out.println(num));
        spliterator.trySplit();
        //try split half the list.
        System.out.println(numbers);

        //ArrayList subList() method example

        ArrayList<Integer> sublist1 = new ArrayList<>(Arrays.asList(2,4,5,5));
        ArrayList<Integer> sublist2 = new ArrayList<>(Arrays.asList(2,5,6,9,8,3));
        System.out.println(sublist1);
        System.out.println(sublist2);

        //sublist1.subList(2,4);
        System.out.println(sublist1.subList(2,4));

        //ArrayList toArray() method example

        ArrayList<Integer> tlist = new ArrayList<>();
        tlist.add(12);
        tlist.add(13);
        tlist.add(33);
        tlist.add(36);
        System.out.println(tlist);

        Integer arr[] = tlist.toArray(new Integer[tlist.size()]);
        System.out.println(Arrays.toString(arr));

       // arr[9] = 9;









    }
}
