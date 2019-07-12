package File_IO.Create_IO;

import java.io.*;

public class FilewriterDemo {

    static String filecontent = "Using Printwriter class";

    public static void main(String[] args) throws IOException{
        usingPrintWriter();
        usingDataOutput();

    }
    public static void usingPrintWriter() throws IOException{
        String filecontent = "Using Printwriter class";

        FileWriter fileWriter = new FileWriter("TestFileOne.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(filecontent);
        //append later
        printWriter.printf(" Java Class %s " , " Java - topic");
        printWriter.close();
    }
    public static void usingDataOutput() throws IOException{
        FileOutputStream outputStream = new FileOutputStream("src/File_IO/TestFileOne.txt");
        DataOutputStream dataOutputStream = new DataOutputStream( new BufferedOutputStream(outputStream));
        //BUffered will convert data into binary.
        dataOutputStream.writeUTF(filecontent);
        dataOutputStream.close();
    }
}
