package impl;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spec.ContactManager;

/**
 * ContactManagerImplTest
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class ContactManagerImplTest {
    
    public ContactManagerImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testContactManager() {
        try {
            ContactManager manager = new ContactManagerImpl();
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testAddNewContact() {
        ContactManager manager = new ContactManagerImpl();
        String name = "Pedro";
        String notes = "Some notes";
        int id = manager.addNewContact(name, notes);
        assertTrue(id > 0);

        String name2 = "Pedro";
        String notes2 = "Some notes";
        int id2 = manager.addNewContact(name2, notes2);
        assertTrue(id2 > 0);
        assertTrue(id2 > id);
    }

}
