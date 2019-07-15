package File_IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CreateFile {

    public static void main(String[] args) {
        try {
            createFileUsingClass();
            createFileUsingFileOutputStream();
            createFileUsingNIO();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void createFileUsingClass() throws IOException {

        File file = new File(" TestFileOne.txt");

        // Create the file
        if (file.createNewFile()) {

            System.out.println("File has been Created");

        }else{

            System.out.println("File Already Exit");
        }

        // Write to the File

        FileWriter writer = new FileWriter(file);
        writer.write("File writer class...");
        writer.close();
    }
    public static void createFileUsingFileOutputStream() throws IOException{

        String content = "This is using File Input Stream";

        FileOutputStream out = new FileOutputStream("TestFileTwo.txt");
        out.write(content.getBytes());
    }

    public static void createFileUsingNIO() throws IOException{

        String content = " Using class from NIO package";
        Files.write(Paths.get("TestFileThree.txt"), content.getBytes());


    }

    }




