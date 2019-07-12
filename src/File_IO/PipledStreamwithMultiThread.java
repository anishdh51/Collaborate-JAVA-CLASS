package File_IO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipledStreamwithMultiThread {


    public static void main(String[] args) throws IOException, InterruptedException {

    usingPipedStreamClass();
    }

    public static void usingPipedStreamClass() throws IOException, InterruptedException{
        final PipedInputStream pipedInputStream = new PipedInputStream();
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();

        // connect reader to writer
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
             for(int i = 65; i< 100; i++){

                 try{

                     pipedOutputStream.write(i);
                     Thread.sleep(500);
                 }catch (IOException | InterruptedException e){
                     System.out.println("Something went wrong on writer thread");
                 }
             }
            }
        });

        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
           for (int i = 65; i< 100; i++){
               try {

                   System.out.println((char)pipedInputStream.read());
                   Thread.sleep(1000);
               }catch(InterruptedException | IOException e){
                   System.out.println("Exception in Reader Class");

               }

           }
            }
        });

        // Start the threads

        writer.start();
        reader.start();

        // Join thread

        writer.join();
        reader.join();

        // close the stream

        pipedInputStream.close();
        pipedOutputStream.close();
    }
}
