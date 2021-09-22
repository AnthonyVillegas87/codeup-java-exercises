
package fileio;
import java.io.IOException;
import java.nio.file.*;
public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path.toAbsolutePath());

        Path pathForCurrentLecture = Paths.get("src", "FileIOLecture.java");
        System.out.println(pathForCurrentLecture);

        Path pathToDataDirectory = Paths.get("src/data");
        //System.out.println(pathToDataDirectory);
        try {
            Files.createDirectories(pathToDataDirectory);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
