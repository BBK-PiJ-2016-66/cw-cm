package impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ContactImplTest
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class ContactImplTest {
    
    public ContactImplTest() {
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
    public void testContactImplWithIdAndNameAndNotes() {
        try {
            int id = 1;
            String name = "Pedro";
            String notes = "Some notes";
            ContactImpl contact = new ContactImpl(id, name, notes);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testContactImplWithIdAndName() {
        try {
            int id = 1;
            String name = "Pedro";
            ContactImpl contact = new ContactImpl(id, name);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testContactImplWithIdAndNameAndNotesRaisesIllegalArgumentExceptionOnInvalidId() {
        try {
            int id = 0;
            String name = "Pedro";
            String notes = "Some notes";
            ContactImpl contact = new ContactImpl(id, name, notes);
            fail("Missing exception!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testContactImplWithIdAndNameRaisesIllegalArgumentExceptionOnInvalidId() {
        try {
            int id = 0;
            String name = "Pedro";
            ContactImpl contact = new ContactImpl(id, name);
            fail("Missing exception!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testGetId() {
        int id = 1;
        String name = "Pedro";
        String notes = "Some notes";
        ContactImpl contact = new ContactImpl(id, name, notes);
        assertEquals(1, contact.getId());
    }
}
