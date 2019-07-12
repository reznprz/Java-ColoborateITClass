package collection.Map_interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmaptest1 {
     /*
        One Hashmap with k = float type and Value long
        1. add the data
        3. remove one data
        4. Iterare (Loop via key and key/Value)
         */

    public static void main(String[] args) {

        Map<Float,Long> hashMap = new HashMap<>();
        hashMap.put(1F,22L);
        hashMap.put(2F,44L);
        hashMap.put(3F,55L);
        hashMap.put(4F,66L);

        System.out.println(hashMap);
        System.out.println( " removing the data " + "\n");
        hashMap.remove(3);
        System.out.println(hashMap);

        //using iterate

        //via key

        Iterator<Float> iterator = hashMap.keySet().iterator();
        while(iterator.hasNext()){
            Float key = iterator.next();
            Long value = hashMap.get(key);
            System.out.println(hashMap);
        }

        //via key and valaue

        Iterator<Map.Entry<Float,Long>> iterator1 = hashMap.entrySet().iterator();
        while(iterator1.hasNext()){
            Map.Entry<Float, Long> map1 = iterator1.next();
            System.out.println("this is the key: " + map1.getKey() + " this is the vlaue: " + map1.getValue());
        }



    }
}
