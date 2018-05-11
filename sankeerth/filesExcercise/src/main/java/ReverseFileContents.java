import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReverseFileContents {

    public static final String SOURCE = "C:\\bench\\training\\sankeerth\\filesExcercise\\src\\main\\java\\contents.txt";
    public static final String DESTINATION = "C:\\bench\\training\\sankeerth\\filesExcercise\\src\\main\\java\\reversed.txt";
    private static Scanner input;
    private static Formatter output;

    public static void main(String[] args) throws Exception {
        openFile();
        readContents();
        closeFile();
    }

    private static void openFile() {
        try {
            input = new Scanner(Paths.get(SOURCE));
            output = new Formatter(DESTINATION);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readContents() throws Exception {
        int temp;
        StringBuffer stringBuffer = new StringBuffer();
        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println("line = " + line);
            stringBuffer.append(line +"\n");

        }
        String out = stringBuffer.reverse().toString();
        System.out.println("out = " + out);
        output.format("%s", out);
    }

    private static void closeFile() throws Exception{
        input.close();
        output.close();
    }
}
