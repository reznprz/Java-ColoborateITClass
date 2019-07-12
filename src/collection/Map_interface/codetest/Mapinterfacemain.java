package collection.Map_interface.codetest;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapinterfacemain {

    /*
    2. Create with HashMap and user Person class as value ..
       1. Add the data by calling constructor of person class
       2. Remove
       3. Clone
       4. ContainKey
       5. Loop using key/value pair
     */

    public static void main(String[] args) {

//        Map<Integer, Person> map = new HashMap<>();
//
//        Person person = new Person(1122L,"Ram Shyam", new Date(),"village drive");
//        Person p1 = new Person();
//
//        map.put(1,new Person(1122L,"Ram Shyam", new Date(),"village drive"));
//        map.put(2,new Person(1111L,"Sita Ram", new Date(), "old village"));
//        p1.setPERSONID(1L);
//        p1.setPERSONNAME("Hari ram");
//        p1.setDOB(new Date());
//        p1.setAddress("new viilage drive");
//
//       // map.put(3,(p1.setPERSONID(1L), p1.setPERSONNAME("Hari ram"), p1.setDOB(new Date()), p1.setAddress("new viilage drive"));
//        map.put(3, p1);
//        System.out.println(map);
//
//        //remove
//
//        map.remove(2);
//        System.out.println(map);
//
//        //clone
//
//        Map<Integer, Person> map2 = new HashMap<>(map);
//        System.out.println(map2);
//
//        Boolean b = map2.containsKey(2);
//        System.out.println(b);
//
//        Iterator<Map.Entry<Integer, Person>> iterator = map2.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer, Person> integerPersonEntry = iterator.next();
//            System.out.println(map2);
   //     }





        getPersonMap(1,1100,"ram ", new Date(), "address1");
        getPersonMap(2,1101,"sita ", new Date(), "address2");
        getPersonMap(3,1102,"hari", new Date(), "address3");






    }

    public static HashMap<Integer, Person> getPersonMap(int key, long id, String name, Date dob, String add){
        Map<Integer, Person> map3 = new HashMap<>();

        Person person = new Person();
        person.setAddress(add);
        person.setDOB(dob);
        person.setPERSONNAME(name);
        person.setPERSONID(id);

        map3.put(key,person);

        Iterator<Map.Entry<Integer, Person>> iterator1 = map3.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, Person> integerPersonEntry = iterator1.next();
            System.out.println(map3);
        }

        return (HashMap<Integer, Person>) map3;

    }



}
