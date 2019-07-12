package File_IO.File_IO_nextpart_delet;

import java.io.File;
import java.io.IOException;

public class DeletThefile {

    public static void main(String[] args) {

        try{
            File file = new File("/Users/rijanprajapati/Desktop/TobeDeleted.txt");

            if(file.createNewFile())
            {
                System.out.println("file is cereated");
            }
            if(file.delete()){
                System.out.println("file has been deleted");
            }

            else{
                System.out.println("file cannot be deleted ");
            }

        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
