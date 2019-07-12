package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class CommonExceptionClasses {

    public static void main(String[] args) {

        //IO Exception == Input Output

        //1. file not found

        try{
            new FileReader(new File("Text.tet"));
        }
        catch (FileNotFoundException e){
            System.out.println("file not found.....");
        }

        //URL website address not file

        try{
            new URL("htp://gmailsss.com");
        }
        catch (MalformedURLException e){
            System.out.println("URL is not correctly define...");
        }

        // Parse exception

        try{
            new SimpleDateFormat("MM,DD,YYY").parse("Invalid-date");
        }
        catch (ParseException e){
            System.out.println("Date format is not read able ");
        }

        //Thread interrupted exception


        try{
            Thread.sleep(3L);
        }
        catch (InterruptedException e){
            System.out.println("Thread exception ");
        }


        //String index about of bound


        String str = "Hello World";
        try{
            System.out.println(str.charAt(-1));
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bound ");
        }

        // number format exception.........
        String s = "10ABC";
        try{
            int x = Integer.parseInt(s);

        }catch (NullPointerException e){
            System.out.println("this is NUmberformatException....");
        }

        // Illegal Exception arugment

        try{
            Thread.sleep(-100);
        } catch (IllegalArgumentException | InterruptedException e) {
            System.out.println("This is Illegal Argument.....");
        }


    }
}
