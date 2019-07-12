package File_IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Append_File {


    public static void main ( String [] args ) throws IOException {

        String textTobeAppended = "This is more lines after existing lines";
        BufferedWriter writer =
                new BufferedWriter( new FileWriter( "TestFileOne.txt",
                        true));
        writer.newLine();
        writer.write(textTobeAppended);
        writer.close();

        FileOutputStream outputStream = new FileOutputStream("TestFileOne.txt", true);
        byte[] strArray = textTobeAppended.getBytes();
        outputStream.write(strArray);
        outputStream.close();

    }

}
