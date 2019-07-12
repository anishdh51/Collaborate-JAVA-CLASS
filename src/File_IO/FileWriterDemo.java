package File_IO;

import java.io.*;

public class FileWriterDemo {

    static String fileContent = "Using PrintWriter Class";
     public static void main ( String [] args ) throws IOException {
    usingPrintWriter();


     }
    public static void usingPrintWriter() throws IOException{

         String fileContent = " Using PrintWriter Class";
        FileWriter fileWriter = new FileWriter("TestFileOne.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append(fileContent);
        printWriter.println("Java Class Java - Topic");
        printWriter.close();
    }
    public static void usingDataOutPut() throws IOException{

        FileOutputStream fileOutputStream = new FileOutputStream("src/File_IO/TestFileOne.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(fileOutputStream));

        dataOutputStream.writeUTF(fileContent);
        dataOutputStream.close();

    }


}
