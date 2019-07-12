package Class_Definition;

import java.util.SortedMap;

public class Demo {

    int numOne;
    static int numtwo;

    public static void getNum(){
        Demo d = new Demo();
        d.numOne = 12;

        numtwo = 10;
    }

    public void getSomeinfo(){
        numOne = 20;
        numtwo = 30;

    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        // static means u have to do it in one way

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

    }
}
