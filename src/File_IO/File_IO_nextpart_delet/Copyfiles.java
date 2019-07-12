package File_IO.File_IO_nextpart_delet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyfiles {


    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            File infile = new File("Readfile.txt");
            File outfile = new File("CopyofReadFile.txt");

            inputStream = new FileInputStream(infile);
            outputStream = new FileOutputStream(outfile);

            byte[] buffer = new byte[(int) infile.length()];
            int length;

            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0,length);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("file copied");
        }
        catch (Exception e){
            e.getMessage();
        }
    }
}
