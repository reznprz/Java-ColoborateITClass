package dayone.Controlflow;

import java.util.Scanner;

public class Multiple_Ifs {
    //format option command L

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scan.nextInt();
        System.out.println(" value of a " + a);

        if (a == 1) {
            System.out.println("one");

        } else if (a == 2) {
            System.out.println("two");

        } else if (a == 3) {

            System.out.println("three");
        } else if (a == 4) {

            System.out.println("four");
        } else {
            System.out.println("not valid number");
        }

    }
}
