package File_IO;

import java.io.File;


public class DeleteTheFile {

    public static void main(String[] args) {


        File file = new File("TestFileDemo.txt");

        try {

            if (file.delete()) {
                System.out.println("File has been deleted");
            } else {
                System.out.println("File cannot be deleted");
            }


        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
