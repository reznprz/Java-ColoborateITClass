package File_IO.IO_multithread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;



public class PipledStreamWithMultiThread {

    public static void main(String[] args) {


    }
    public static void usingPipedStreamClass() throws IOException, InterruptedException {
        // imp read from two data source at atime. multiple data source.  = PipedINputStream
        final PipedInputStream pipedInputStream = new PipedInputStream();
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();

        // connect reader to writer
        pipedInputStream.connect(pipedOutputStream);

        //creating thread in java

        //calling thread constuctor
        Thread writer = new Thread(new Runnable() {
            //runnable as argument and interface.
            //runnable is an abstact class.

            @Override
            public void run() {
                for(int i = 65; i < 95; i++){
                    //why 65? ==
                    try{
                        pipedOutputStream.write(i);
                        Thread.sleep(5000);
                    }
                    catch (IOException | InterruptedException e){
                        System.out.println("something went wrong in writer thread..");
                    }
                }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 65; i < 91; i++){

                    try{
                        System.out.println((char)pipedInputStream.read());
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException | IOException e){
                        System.out.println("something went wrong in reader thread");
                    }
                }
            }
        });

        //Start the thread
        writer.start();
        reader.start();

        //join thread
        writer.join(); // make sure next join is only invole after 1st join
        reader.join();


        pipedInputStream.close();
        pipedOutputStream.close();
    }
}
