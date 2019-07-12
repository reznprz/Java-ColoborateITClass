package dayone.LoopsInjava;

public class ForLoopwithtwovariable {
    public static void main(String[] args) {
        int limit = 10;
        int sum = 0;

        for(int i=1, j = 0; i<= limit;i++,j++){
            System.out.println("value of i " + i);
            System.out.println("value of j " + j);
            sum += i + j;
            System.out.println("final value if sum "+ sum);

        }
        //System.out.println(sum);


        //how to decreases the loop counter
        for(int k = 10; k > 1; k--) {
            System.out.println("value of k: " + k);
        }

    }
}
