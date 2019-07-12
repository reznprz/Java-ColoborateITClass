package stringdemo;

import java.util.SortedMap;

public class String_demo {

    public static void main(String[] args) {
        //Concat

        String str = "Hello";
        String strTwo = "World";

        System.out.println(str + strTwo);
        System.out.println(str.concat(strTwo));

        //HashCode

        //memory have the value in code
        System.out.println(str.hashCode());
        System.out.println("Hello".hashCode());

        //Contains (boolean value ) return true or false

        System.out.println("Java Learnig!!".contains("Java"));

        //compareTo()
        //gives difference according to dictnory

        System.out.println("apple".compareTo("banana"));

        // compareToignoreCase()
        //it ignore the uppercase and print 0

        System.out.println("apple".compareTo("apple"));
        System.out.println("apple".compareToIgnoreCase("Apple"));

    }
}
