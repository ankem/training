import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SerializeEmployeeTest {
    List<Employee> employees = Arrays.asList(
            new Employee("a", "b", 10, 100, "m"),
            new Employee("b", "b", 10, 100, "m"),
            new Employee("c", "b", 10, 100, "m"),
            new Employee("d", "b", 10, 100, "m")
    );

    @Test
    public void shouldPutEmployeesInFile() throws Exception{
        ByteArrayOutputStream stream = new ByteArrayOutputStream(1000);
        SerializeEmployee.serialize(employees, stream);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(stream.toByteArray());

        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        Object actual = objectInputStream.readObject();
        List<Employee> actualEmployees = (List<Employee>) actual;
        assertEquals(employees, actualEmployees);
    }
}