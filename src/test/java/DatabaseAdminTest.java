import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Gregor Campbell", "GC801119E", 3000);
    }

    @Test
    public void hasName(){
        assertEquals("Gregor Campbell", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GC801119E", databaseAdmin.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(3000, databaseAdmin.getSalary());

    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary((double) 10);
        assertEquals(3010,databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(3300, databaseAdmin.payBonus(), 10);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Lord Sugar");
        assertEquals("Lord Sugar", databaseAdmin.getName());
    }


}
