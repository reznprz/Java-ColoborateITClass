package dayone.referenceDataType.datatype2;

public class Integer_intro {
    public static void main(String[] args) {
        //Wrapper class
        System.out.println(Long.SIZE);
        for (int i=0; i <= 16;i++){
            System.out.print(i);
        }
        int a = 22;
        int b = 3;
        int c = 3;

        if(b>a){
            b=a;

        }if(c>a){
            c=a;

        }else{
            System.out.println("this is large number: "+a);

        }

    }
}
