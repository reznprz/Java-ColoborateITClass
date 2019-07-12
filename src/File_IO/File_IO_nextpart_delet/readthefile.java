package File_IO.File_IO_nextpart_delet;

import java.io.*;

public class readthefile {
    public static void main(String[] args) throws IOException {

       // String fileName = "testfilethree";
        //File file = new File(fileName);

        FileReader file2 = new FileReader("testfilethree.txt");
     //  FileReader file = new FileReader(fileName);
       BufferedReader r = new BufferedReader(file2);
     //  BufferedReader reader = new BufferedReader(file);
       String text = "";
       String line = r.readLine();

       while (line != null){
           text += line;
           line  = r.readLine();
       }
        System.out.println(text);
    }
}
