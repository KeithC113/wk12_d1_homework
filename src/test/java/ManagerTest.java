import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

Manager manager;

@Before
    public void before(){
    manager = new Manager("Keith Campbell", "JA801119E", 1000, "Java");
}

@Test 
    public void hasName(){
    assertEquals("Keith Campbell", manager.getName());
}

@Test
    public void hasNINumber(){
    assertEquals("JA801119E", manager.getNI());
}

@Test
    public void hasSalary(){
    assertEquals(1000, manager.getSalary());

}

@Test
    public void hasDeptName(){
    assertEquals("Java", manager.getDeptName());
}

@Test
    public void canRaiseSalary(){
    manager.raiseSalary((double) 10);
    assertEquals(1010,manager.getSalary());
}

@Test
    public void canPayBonus(){
        assertEquals(1100, manager.payBonus(), 10);
    }
@Test
    public void canChangeName(){
        manager.setName("Lord Sugar");
        assertEquals("Lord Sugar", manager.getName());
    }

}
