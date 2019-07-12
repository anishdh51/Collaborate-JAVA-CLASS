package File_IO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {

    public static void main(String[] args) {


        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try{
            File infile = new File ("src/File_IO/ReadFile.txt");
            File ouFile = new File("src/File_IO/CopyOfReadFile.txt");

            inputStream = new FileInputStream(infile);
            outputStream = new FileOutputStream(ouFile);

            byte [] buffer = new byte[1024];
            int length;

            while ((length = inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("File copied");

        }catch (IOException e){
            System.out.println("Exception");

        }
    }
}
