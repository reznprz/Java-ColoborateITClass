package Operators.Logical_Operators;

public class Logical_with_If {

    public static void main(String[] args) {
        //AND
        int a = 0;
        int b = 1;

        if (a== 0 && b ==1){
            System.out.println("here");

        }else{
            System.out.println("there");
        }

        // && vs &

        int value = 8;
        int count = 10;
        int limit = 11;

        if(++value % 2 == 0 & ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);

        // 0r
        //the logical OR, ||,
        // omits the evaluation of the right-hand operand when the left-hand operand is true;

        if (++value % 2 == 0 | ++count < limit){
            System.out.println("here");
            System.out.println(value);
            System.out.println(count);
        }
        System.out.println("there");
        System.out.println(value);
        System.out.println(count);

        //boolean not equal to

        int i = 0;
        if(!(i==0)){
            System.out.println("i is not 0");


        }else {
            System.out.println("i is 0");
        }

    }
}
