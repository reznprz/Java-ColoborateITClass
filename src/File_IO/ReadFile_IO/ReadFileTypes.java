package File_IO.ReadFile_IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileTypes {

    public static void main(String[] args) {
        //value of variabale in method beacuse the method return string
        String str = readLineByLine("src/File_IO/Readfile.txt");
        System.out.println(str.toLowerCase());

        String str2 = readAllWithReaderClass("src/File_IO/Readfile.txt");
        System.out.println(str2);

        String str3 = usingBufferedClass("src/File_IO/Readfile.txt");
        System.out.println(str3);

        readFileUsingByteArray("TestFileOne.txt");


    }
    //Read the file convert in String

    public static  String readLineByLine(String filepath){

        //imp note: Stringbuilder convert binary data to string
        StringBuilder stringBuilder = new StringBuilder();

            //stream is new class release in java 8
            try {
                Stream<String> stream = Files.lines(Paths.get(filepath), StandardCharsets.UTF_8);
                stream.forEach(s -> stringBuilder.append(s).append("\n"));
            } catch (IOException e) {
                System.out.println("cannot read the file");

            }

        return stringBuilder.toString();
    }

    //Files class read file


    public static String readAllWithReaderClass(String filePath){
        String  str = "";

        try{
            str = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e){
            e.getMessage();
        }

        return str.toUpperCase();
    }
    //Read file using Bufferedreader class


    public static String usingBufferedClass(String filePath){

        // imp note : buffeeredReader read the file  and pass it to filereader and file reader convert it into 1010 and
        // pass it to the String builder and the file input it finally read as String.
        StringBuilder stringBuilder = new StringBuilder();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String currentLine;
            while((currentLine = bufferedReader.readLine()) != null){
                stringBuilder.append(currentLine).append("\n");
            }
        }
        catch (IOException e){

        }

        return stringBuilder.toString();
    }

//    public static String usingBufferedclass2(String filepath){
//        StringBuilder stringBuilder = new StringBuilder();
//
//        try{
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileReader(filepath));
//        }
//
//        catch (IOException e){
//            e.getMessage();
//        }
//
//        return stringBuilder.toString();
//    }


    public static byte[] readFileUsingByteArray(String file){

        // imp note: FileinputStream read the input and convert into binary 10101 and then pass it to Stringbuilder
        FileInputStream inputStream = null;
        byte[] barray = new byte[file.length()];
        try{
            inputStream = new FileInputStream(file);
            inputStream.read(barray);
            inputStream.close();

            for(int i = 0; i < barray.length; i++){
                System.out.println((char) barray[i]);
            }
        }
        catch (IOException e){
            e.getMessage();
        }
        return barray;
    }

}
