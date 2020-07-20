import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void before(){
        developer = new Developer ("Ellie Campbell", "EC801119E", 2000);
    }

    @Test
    public void hasName(){
        assertEquals("Ellie Campbell", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("EC801119E", developer.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(2000, developer.getSalary());

    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary((double) 10);
        assertEquals(2010,developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(2200, developer.payBonus(), 10);
    }
    @Test
    public void canChangeName(){
        developer.setName("Lord Sugar");
        assertEquals("Lord Sugar", developer.getName());
    }


}
