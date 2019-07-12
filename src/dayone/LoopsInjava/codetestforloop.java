package dayone.LoopsInjava;

public class codetestforloop {

//    Given an array of ints, return the number of 9's in the array.
//
//
//    arrayCount9([1, 2, 9]) → 1
//    arrayCount9([1, 9, 9]) → 2
//    arrayCount9([1, 9, 9, 3, 9]) → 3

    public static void number9(int arr[]){
        int i;
        int count = 0;
        for(i=0; i < arr.length;i++){
            if(arr[i] == 9){
                count++;
            }
        }
        System.out.println(" count of 9  is " + count);
    }



    public static void arrayfront9(int numArray[]) {
        if (numArray.length > 4){
            System.out.println("skip");
            for(int i =0; i < numArray.length-1; i++){
                if(numArray[i] == 9){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
        }

    }

    public static void stringtimes(String c){
        String cc = "";
        int n = 5;
        for(int i=0; i < n; i++){
        }
    }

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public static void firstlast6(int input[]){

        if(input[0]==6 || input[input.length-1] == 6) {
            System.out.println("true");
           // System.out.println("true");
        }

    }




    public static void main(String[] args) {
        int b[]= {2,1,2,6};
        firstlast6(b);
    }


}
