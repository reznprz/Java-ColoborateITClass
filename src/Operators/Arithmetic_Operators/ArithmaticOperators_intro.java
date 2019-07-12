package Operators.Arithmetic_Operators;

public class ArithmaticOperators_intro {
    /*
    +	Addition	Adds together two values	x + y
    -	Subtraction	Subtracts one value from another	x - y
    *	Multiplication	Multiplies two values	x * y
    /	Division	Divides one value from another	x / y
    %	Modulus	Returns the division remainder	x % y
    ++	Increment	Increases the value of a variable by 1	++x
    --	Decrement	Decreases the value of a variable by 1	--x
    %=  Modulus assignment
    /= Division assignment
    -= Subtraction assignment
     */
    public static void main(String[] args) {
        System.out.println("Interger Arithmetic");
        int a = 1 + 1 ;
        int b = a * 3 ;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        // arithmetic using doubles
        System.out.println("\nfloating point  Arithmetic");
        double da = 1 + 1 ;
        double db = da * 3 ;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}
