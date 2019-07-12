package File_IO.File_IO_nextpart_delet;

import java.io.File;

public class Renamingfile {

    public static void main(String[] args) {
        File file = new File("renametonewname.txt");
        File file2 = new File("newfile.txt");



        //Boolean i;
        if(file.renameTo(file2)){
            System.out.println("File renamed");
        }else{
            System.out.println("Sorry! the file can't be renamed");
        }
    }
}
