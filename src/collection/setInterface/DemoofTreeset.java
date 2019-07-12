package collection.setInterface;

import collection.Map_interface.codetest.Person;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoofTreeset {

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        integers.add(555);
        integers.add(54);
        integers.add(52);
        integers.add(5);
        integers.add(2);

        System.out.println(integers);

        System.out.println("====== TreeSET =======");
        Set<Integer> set = new TreeSet<>(integers);
        System.out.println(set);

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person((long) 12,"Name",new Date(), "add"));
        personSet.add(new Person((long) 14,"Name1",new Date(), "add1"));
        personSet.add(new Person((long) 15,"Name2",new Date(), "add2"));

        System.out.println(personSet);





    }
}
