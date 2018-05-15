import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTableTest {

    @Test
    public void testHighestSalaried(){

        EmployeeTable e = new EmployeeTable();
        String expected ="success";
        e.updateRecord(7);
    }
}
