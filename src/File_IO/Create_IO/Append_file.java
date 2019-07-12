package File_IO.Create_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Append_file {

    public static void main(String[] args) throws IOException {
        String texttobeappend = "This more lines after existing line";


        BufferedWriter writer =
                new BufferedWriter(new FileWriter("TestFileOne.txt", true));
        writer.newLine();
        writer.write(texttobeappend);
        writer.close();


        FileOutputStream outputStream = new FileOutputStream("TestFileOne.txt", true);
        byte[] strArray = texttobeappend.getBytes();
        outputStream.write(strArray);
        outputStream.close();
    }
}
