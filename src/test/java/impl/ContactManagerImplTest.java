package impl;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spec.Contact;
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
        Set<Contact> contacts = manager.getContacts(name);
        assertEquals(1, contacts.size());
        Contact contact = contacts.iterator().next();
        assertEquals(id, contact.getId());
        assertEquals(name, contact.getName());
        assertEquals(notes, contact.getNotes());
    }

}
