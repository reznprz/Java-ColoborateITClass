package collection.setInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface_intro {

    public static void main(String[] args) {

        Set<Integer> numList = new HashSet<>();
        numList.add(23);
        numList.add(33);
        numList.add(23);
        numList.add(77);
        numList.add(11);

        System.out.println(numList);

        //1st rule of set is it will not allow dublicate
        //2nd = Hashset will not provide any order

        Set<Integer> integersaccsendin = new TreeSet<>(); // treeset wil provide ascending order
        System.out.println(numList);

    }
}
