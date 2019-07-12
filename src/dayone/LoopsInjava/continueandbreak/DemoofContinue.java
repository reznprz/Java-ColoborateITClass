package dayone.LoopsInjava.continueandbreak;

public class DemoofContinue {


    public static void main(String[] args) {
        for(int i = 0; i < 6; i++){
            if(i ==4){
                System.out.println("four");
            }
            System.out.println(i);
        }


        for(int i =0; i < 1000; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}
