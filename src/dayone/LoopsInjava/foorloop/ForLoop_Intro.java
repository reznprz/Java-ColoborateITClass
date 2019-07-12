package dayone.LoopsInjava.foorloop;

public class ForLoop_Intro {

    public static void main(String[] args) {
        //print 0 to 5 in sysout.

       // initialize of value
        int x =1;
        //decelration
        int y;
        for ( int i = 0; i <= 5;i++){
            System.out.println(i + "" );
        }


        //loop without any conditoin in the for

        int m=0;
        for(;;){
            //print value of m
            System.out.println(m);
            //post increment the value of m

            m++;

            if(m>4){
                break;
            }

        }
    }
}
