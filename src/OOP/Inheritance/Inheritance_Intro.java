package OOP.Inheritance;

public class Inheritance_Intro extends A {
    //Java doesn't allowed multiple inheritance.
    int i;
    public static void main(String[] args) {

        Inheritance_Intro intro = new Inheritance_Intro();
        intro.id=15;
        intro.sum = 55;
        intro.total = 95;
        intro.sumofall(4,6,8);

        A a = new A();
        a.id = 15;
        a.sum = 45;
        a.total = 65;
        a.sumofall(5,7,9);

        int n = Inheritance_Intro.numOne;
        int a1 = A.numOne;
    }
}

class A {
    int id;
    int sum;
    int total;
    static int numOne;
    public void sumofall(int a, int b, int c){

        this.id = a;
        this.sum = b;
        this.total = c;
        System.out.println(a+b+c);
    }
}
