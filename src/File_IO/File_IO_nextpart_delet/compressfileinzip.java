package File_IO.File_IO_nextpart_delet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class compressfileinzip {
    public static void main(String[] args) {

        try {
            zipfilemethod("testfilethree.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void zipfilemethod(String filename) throws IOException {

        try {
            File file = new File(filename);
            String Zipfilename = file.getName().concat(".zip");

            FileOutputStream fileOutputStream = new FileOutputStream(Zipfilename);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);

            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));

            byte bytes[] = Files.readAllBytes(Paths.get(filename));

            zipOutputStream.write(bytes, 0, bytes.length);
            zipOutputStream.closeEntry();
            zipOutputStream.close();

        }
        catch (FileNotFoundException e){
            System.out.println("The file %s does not exist" + filename);
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex);
        }

    }
}
