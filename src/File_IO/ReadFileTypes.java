package File_IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileTypes {

    public static void main ( String [] args ){
        String str = readLineByLine("src/File_IO/ReadFile.txt");
        System.out.println(str.toLowerCase());
        String strOne = usingBufferedClass("src/File_IO/ReadFile.txt");
        System.out.println(strOne);

        String strTwo = usingBufferedClass("src/File_IO/ReadFile.txt");
        System.out.println(strTwo);
    }

    // Read the File convert in String ...

public static String readLineByLine(String filePath){

        StringBuilder stringBuilder = new StringBuilder();
        try {
            Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8);

        stream.forEach(s -> stringBuilder.append(s).append("\n"));

        }catch(IOException e){
            System.out.println("Can not read the file ");
        }
        return stringBuilder.toString();

}

// Read File Using BufferedReader Class
    public static String usingBufferedClass(String filepath){
StringBuilder stringBuilder = new StringBuilder();

try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
    String currentLine;
    while((currentLine = bufferedReader.readLine()) != null){
        stringBuilder.append(currentLine).append("\n");
    }
}catch (IOException e){
    e.getMessage();
}
return stringBuilder.toString();
    }



// Convert Data from File intro byte [] array then process it

    public static byte[] readFileUsingByteArray(String file){
        FileInputStream inputStream = null;
        byte [] barray = new byte [file.length()];
        try {
            inputStream = new FileInputStream(file);
            inputStream.read(barray);
            inputStream.close();

            for (int i=0; i<barray.length; i++){
                System.out.println((char) barray[i]);
            }
        }catch(IOException e){

        }
        return barray;
    }
}
