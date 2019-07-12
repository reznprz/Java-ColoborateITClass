package collection.Map_interface;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        //the first one is always the key
        //example Interger is key.

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5, "A");
        map.put(6,"B");
        map.put(7,"C");
        map.put(8,"D");
        System.out.println("printing haspmap");
        System.out.println(map);

        //read the specific data set

        String value = map.get(2);
        System.out.println("this is value of key :" + value);

        //remove the data

        map.remove(3);
        System.out.println("====Remove Method======");
        System.out.println(map);

        //how to loop HashMap
        // loop via the key

        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            String value1 = map.get(key);
            System.out.println("this is key : " + key + " and value is: " + value1);
        }

        //loop via key and value both

        Iterator<Map.Entry<Integer,String>> entryInteger = map.entrySet().iterator();
        while(entryInteger.hasNext()){
            Map.Entry<Integer, String> entry = entryInteger.next();
            System.out.println("This is key :" + entry.getKey() + " this is value: " + entry.getValue());
        }
        /*
        One Hashmap with k = float type and Value long
        1. add the data
        3. remove one data
        4. Iterare (Loop via key and key/Value)
         */





    }
}
