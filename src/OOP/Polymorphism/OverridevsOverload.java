package OOP.Polymorphism;

public class OverridevsOverload {

    public static int addNum(int a, int b){
        System.out.println(a + b);
        System.out.println(" this is integre: ");
        return a + b;
    }

    public static long addNum(long a , long b){
        System.out.println(a + b);
        System.out.println(" this is long: ");
        return a + b;
    }

    public static void main(String[] args) {
        addNum(3L, 4L);
        addNum(4,5);
    }
}
