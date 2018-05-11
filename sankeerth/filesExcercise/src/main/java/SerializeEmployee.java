import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class SerializeEmployee {

    public static final String FILE = "c://bench//temp.ser";



    public static void serialize(List<Employee> employees, OutputStream file) throws Exception{

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(employees);
        objectOutputStream.close();
//
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE));
//        Object o = inputStream.readObject();
//        System.out.println("o = " + o);
    }



}
