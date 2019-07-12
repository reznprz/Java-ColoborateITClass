package OOP.Encapsulatio;

public class Encapsulation_intro extends  Encap {
    public static void main(String[] args) {

        Encap obj = new Encapsulation_intro();
        obj.getDOB();

        obj.printt();
        Encap ob1 = new Encap();//
        ob1.printt();
    }

}
class Encap{
    private int numOne;
    private int numTwo;

    private int SSN;
    //anything private doesnt go to outside the class.
    private int DOB;

    public int getSSN() {
        return SSN;
    }
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    public int getDOB() {
        return DOB;
    }
    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
    public static void print(){
        System.out.println("this is static void print method of class Encap");
    }
    public void printt(){
        System.out.println("this is void print method of class Encap");
    }
}

