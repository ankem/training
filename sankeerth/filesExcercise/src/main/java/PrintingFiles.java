import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingFiles {

    public Path getUserInput(Scanner input1) {
        Path myPath = Paths.get(input1.nextLine());
        return myPath;
    }

    public String[] getContents(Path input) throws IOException {
        List<String> list = new ArrayList<String>();

        if (Files.isDirectory(input)) {
            DirectoryStream<Path> dirstream = Files.newDirectoryStream(input);
            for (Path p : dirstream) {
                list.add(p.getFileName().toString());
            }
        }

        String[] array = new String[list.size()];
        array = list.toArray(array);

        return array;
    }

    public static void main(String[] args) throws Exception {
        Path p = Paths.get("c://bench");
        List<String> output = PrintingFiles.getDirectoryContents(p, null);
        System.out.println("output = " + output);
    }


    public static List<String> getDirectoryContents(Path path, List<String> accumulator) throws Exception {
        List<String> result = accumulator == null ? new ArrayList<>() : accumulator;
        if (Files.isDirectory(path)) {
            DirectoryStream<Path> dirstream = Files.newDirectoryStream(path);
            for (Path p : dirstream) {
                if (Files.isDirectory(p)) {
                    getDirectoryContents(p, result);
                }
                result.add(p.getFileName().toString());
            }
        }
        return result;
    }


//    public static void main(String[] args) throws IOException {
//
//        if (Files.isDirectory(path)) {
//            System.out.printf("%n " + path.getFileName() + "  exists %n");
//
//            DirectoryStream<Path> dirstream = Files.newDirectoryStream(path);
//            for (Path p : dirstream) {
//                System.out.println(p);
//                while (Files.exists(p)) {
//                    DirectoryStream<Path> dirstream1 = Files.newDirectoryStream(p);
//                    for (Path p1 : dirstream1) {
//                        System.out.println(p1);
//                    }
//                    System.out.println("No more files in " + dirstream1);
//                }
//            }
//        }
//    }


}
