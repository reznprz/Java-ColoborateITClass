package dayone.referenceDataType;

public class String_Intro {

    public static void main(String[] args) {
        String s1 = "1" + "2";
        System.out.println(s1);

        String strTwo = s1 + " = 4";
        System.out.println(strTwo);

        String name = "Javaclass"; // varibale is name and datatype is String
        int l = name.length();
        System.out.println("Name length is " + l);
        System.out.println(name.toUpperCase());

        String ss1 = "JAVA";
        String ss2 =  "AAAA";

        System.out.println(ss1==ss2); // print boolean value comparing always gives true or false

        boolean b1 = s1.equals(ss2); // comparing the values
        System.out.println(b1);

        String str = "abcde";

        if(str.startsWith("ab")){
            System.out.println("True its starts with ab");

        }else {
            System.out.println(false);
        }
        if(str.endsWith("de")){
            System.out.println("It ends with de ");

        }else{
            System.out.println(false);
        }




    }




}
