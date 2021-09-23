
package fileio;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path.toAbsolutePath());

//        Path pathForCurrentLecture = Paths.get("src", "FileIOLecture.java");
//        System.out.println(pathForCurrentLecture);
//
//        Path pathToDataDirectory = Paths.get("src/data");
//        //System.out.println(pathToDataDirectory);
//        try {
//            Files.createDirectories(pathToDataDirectory);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

        // creatDirectory() can create one directory
        // createDirectories() can create multiple directories
        // createFile() can create files within directories
        // write(pthObj, List) writes out a list to a file
        // readAllFiles(pathToFile) can read the input of a file
        // writeString() takes the path to file and manually add text MUST USE StandardOpenOption.APPEND as an arg

       Path ourTxtFile = Paths.get("src/data", "list.txt");
//        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudia");
//        try{
//            Files.write(ourTxtFile, imperials);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }


        List<String> lateImperials = new ArrayList<>();
        lateImperials.add("Gall Placidia");
        lateImperials.add("Theodora");
        lateImperials.add("Licinia Eudoxia");

        try{
            Files.write(ourTxtFile, lateImperials, StandardOpenOption.APPEND);
        } catch (IOException iox){
            iox.printStackTrace();
        }





    }
}
