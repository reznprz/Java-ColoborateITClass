package File_IO.Create_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class CreateFile {
    public static void main(String[] args) {
        try {
            createFileUisngClass();
            createFileUsingFileOutputStream();
            createFileUsingNIO();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createFileUisngClass() throws IOException {
        //every file IO handle the exception.
        //decalaring the file
        File file = new File("TestFileOne.txt");

        //Create the file
        if(file.createNewFile()){
            System.out.println("file has been created");
        }
        //1st time run create the file
        //2nd time run check there is a file or not.
        else {
            System.out.println("file is already exist");
        }

        //Write to the file
        FileWriter writer = new FileWriter(file);
        writer.write("This is Rijan computer File Writer");

        writer.close(); // this happen in run time.

        // note : this happen in runtime and convert to binary in run time.
    }

    public static void createFileUsingFileOutputStream() throws IOException{

        String content = "This is using file input stream";

        FileOutputStream out = new FileOutputStream("testfiletwo.txt");
        out.write(content.getBytes());//convert string to binary and send it process  vise versa
        out.close();

        //relative path:

    }

    public static void createFileUsingNIO() throws IOException{
        String content = "Using class from NIO package";
        Files.write(Paths.get("testfilethree.txt"), content.getBytes());

        // Array

        String [] strArray = {"TestOne", "TestTwo", "Testthree"};
        Files.write(Paths.get("Testfilefour"), Collections.singleton(content));
    }
}
