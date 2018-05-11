import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class PrintingFilesTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    Scanner myTestPath = new Scanner("c://bench");
//    Scanner myTestPath = new Scanner(".");
    PrintingFiles files = new PrintingFiles();
    Path userInput = files.getUserInput(myTestPath);

    @Test
    public void shouldBeADirectory() throws IOException {
        PrintingFiles files = new PrintingFiles();
        try{
            Path userInput = files.getUserInput(myTestPath);
            assertTrue(Files.isDirectory(userInput));
        }
        catch (InvalidPathException e){
            assertTrue("the entered name is not a directory",false);
        }
    }

    @Test
    public void shouldNotBeEmpty() {
        PrintingFiles files = new PrintingFiles();
        try{
            Path userInput = files.getUserInput(myTestPath);
        }catch(InvalidPathException e){
            assertTrue("the file is invalid",false);
        }
        catch(NoSuchElementException e){
            assertTrue("the file name cannot be empty",false);
        }
        
    }

    @Test
    public void shouldReturnDirectoryContents() throws IOException {
        PrintingFiles files = new PrintingFiles();

    try{
        Path userInput = files.getUserInput(myTestPath);
        DirectoryStream<Path> dirstream = Files.newDirectoryStream(userInput);
        for (Path p : dirstream) {
            System.out.println(p);
        }
    }catch(InvalidPathException e){
        assertTrue("there is a error in retrieving the contents",false);
    }
    }

    @Test
    public void test() throws IOException {
        PrintingFiles printingFiles = new PrintingFiles();
        String[] s = printingFiles.getContents(userInput);
        assertNotNull(s);
        String[] expected = {".idea",
                "filesExcercise.iml",
                "pom.xml",
                "src",
                "target"};
        assertArrayEquals("Expected and Actual",expected,s );
    }
}