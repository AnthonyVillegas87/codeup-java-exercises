
package fileio;
import java.io.IOException;
import java.nio.file.*;
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

        Path ourTxtFile = Paths.get("src/data", "list.txt");
        List<String> imperials = Arrays.asList("Augustus", "Livia", "Agrippina", "Claudia");
        try{
            Files.write(ourTxtFile, imperials);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
