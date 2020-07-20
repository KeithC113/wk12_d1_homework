import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director ("Keith Campbell", "JA801119E", 1000, "Java", (double) 5000);
    }

    @Test
    public void hasName(){
        assertEquals("Keith Campbell", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JA801119E", director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000, director.getSalary());

    }

    @Test
    public void hasDeptName(){
        assertEquals("Java", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary((double) 10);
        assertEquals(1010, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1200, director.payBonus(), 10);
    }
    @Test
    public void hasBudget(){
        assertEquals(5000, director.getBudget(),100);
    }

    @Test
    public void canChangeName(){
        director.setName("Lord Sugar");
        assertEquals("Lord Sugar", director.getName());
    }

    @Test
    public void canPayDoubleBonus(){
        assertEquals(1200, director.payBonus(), 10);
    }

}