package OOP.Inheritance;

public class Mainclass {
    public static void main(String[] args) {
        Three th = new Three();
        th.print_message();
        th.print_num();
        th.print_message();
    }
}
class one{
    public void print_name(){
        System.out.println("Java");
    }
}
class Two extends one{
    int num =10;
    public void print_num(){
        System.out.println("Java + 12");
    }
}
class Three extends Two{

    public void print_message(){
        Two t = new Two();
        t.num = 0;
        System.out.println("text message ");
    }
}