package File_IO.File_IO_nextpart_delet;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.ServerException;

public class filehidden {


    public static void main(String[] args) throws IOException {

        String Filename = "testfilethree.txt";
        hidethefile(Filename);

    }


    public static void hidethefile(String filename){

        File file = new File(filename);

        Path path = FileSystems.getDefault().getPath(filename);
        // Hide file;
        try {

            Process p = Runtime.getRuntime().exec("attrib +H" + filename);
            p.waitFor();
//            Files.setAttribute(path, "dos:hidden", false);
        }
        catch (SecurityException s){
            System.out.println("security error ");
        }

        catch (Exception e) {
            System.out.println(" **error** something wrong");
        }

        boolean fileHidden = file.isHidden();

        if (fileHidden){
            System.out.println(filename + " is hidden ");
        }

        else{
            System.out.println(filename + " isn't hidden ");

        }


    }
}
