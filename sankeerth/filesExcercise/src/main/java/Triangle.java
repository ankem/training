import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class Triangle {

    private static Formatter output;

    public static void main(String[] args){
        openFile();
        addContents();
        closeFile();
    }

    private static void openFile() {
        try{
            output = new Formatter("C:\\bench\\training\\sankeerth\\filesExcercise\\src\\main\\java\\triangle.txt");

        }catch(SecurityException e){
            System.err.println("write denied");
        }
        catch (FileNotFoundException e) {
            System.err.println("Error in writing to file");
        }
    }

    private static void addContents() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = input.nextInt();

        try{
            int k = 2*n - 2;

            for (int i=0; i<n; i++)
            {
                for (int j=0; j<k; j++)
                {
                    output.format(" ");
                }
                k = k - 1;

                for (int j=0; j<=i; j++ )
                {
                    output.format("* ");
                }

                output.format("%n");
            }
        }catch (FormatterClosedException e){

        }

    }

    private static void closeFile() {
        if(output!=null){
            output.close();
        }
    }
}
