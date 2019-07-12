package dayone.referenceDataType.datatype2;

public class Boolean_Intro {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        // type of operator ternory.
        boolean b3 = (100 > 20) ? true : false; // after question mark it return the value according to the conditoin.
        // checking the expression true or not ?
        System.out.println(b3);
        if (b2){
            System.out.println("This is true");
        }else {
            System.out.println("this is false");
        }
        //Wrapper class in java ...
        Boolean bull = Boolean.valueOf("TRUE");
        System.out.println(bull);
    }
}
