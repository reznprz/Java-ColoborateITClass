package dayone.referenceDataType.datatype2;

public class CodeTest {
    public static void main(String[] args) {
        String s = "Hello";
        String name = "Rijan Prajapati";

        System.out.println(s);
        System.out.println(name);

        int n1 = 74;
        int n2 = 36;
        System.out.println("Expected Output:" + "" +(n1+n2));
        //System.out.println(n1+n2);

        int n3 = 50;
        int n4 = 3;
        System.out.println("Expected Output:" + "" +(n3/n4));

        int a = -5 + 8 * 6;
        int b = (55+9)%9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
