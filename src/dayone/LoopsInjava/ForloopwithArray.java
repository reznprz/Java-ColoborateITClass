package dayone.LoopsInjava;

public class ForloopwithArray {

    public static void main(String[] args) {
        //Array can hold more than one value at a time.
        //Array always start with index zero.
        int arr[] = {1,2,3,4,5};
        System.out.println("size of array " + arr.length); //return the size  of array
        System.out.println(arr[3]); // print the index 3 from array

        int arrOne[] = new int[3]; //declare the size of array
        System.out.println(arrOne[0]);

        arrOne[0] = 4;
        arrOne[1] = 44;
        arrOne[2] = 43;

        System.out.println(arrOne[0]);

        int arrTwo[] = {2,11,25,9};

        for(int i = 0; i < arrTwo.length; i++){
            System.out.println("arrry " + arrTwo[i]);
        }





    }
}
