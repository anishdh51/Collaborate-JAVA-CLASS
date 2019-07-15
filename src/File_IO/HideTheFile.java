package File_IO;
import java.io.File;
import java.io.IOException;


public class HideTheFile {

    public static void main(String[] args) throws IOException {


        File file = new File ("FileToHidden.txt");

        if (file.createNewFile()){
            System.out.println("File has been Created");

        }else {

            System.out.println("File is already exists");
        }


        if (file.isHidden()) {
            System.out.println("File is Hidden");
        }else {

            System.out.println("File is Visible");
        }
    }

}
