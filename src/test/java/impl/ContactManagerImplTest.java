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
        assertTrue(id > 0);

        String name2 = "Pedro";
        String notes2 = "Some notes";
        int id2 = manager.addNewContact(name2, notes2);
        assertTrue(id2 > 0);
        assertTrue(id2 > id);
    }

    @Test
    public void testAddNewContactRaisesIllegalArgumentExceptionOnEmptyName() {
        try {
            ContactManager manager = new ContactManagerImpl();
            manager.addNewContact("", "Some notes");
            fail("Missing exception!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testAddNewContactRaisesIllegalArgumentExceptionOnEmptyNotes() {
        try {
            ContactManager manager = new ContactManagerImpl();
            manager.addNewContact("Pedro", "");
            fail("Missing exception!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testGetContactsByName() {
        ContactManager manager = new ContactManagerImpl();

        String name = "Pedro";
        String notes = "Some notes";
        int id = manager.addNewContact(name, notes);
        Set<Contact> contacts = manager.getContacts(name);
        assertTrue(contacts.size() == 1);
        Contact contact = contacts.iterator().next();
        assertEquals(id, contact.getId());
    }

    @Test
    public void testGetContactsByIds() {
        ContactManager manager = new ContactManagerImpl();

        String name = "Pedro";
        String notes = "Some notes";

        for (int i = 1; i < 10; i++) {
            manager.addNewContact(name + i, notes + i);
        }
        int[] ids = {1, 3, 5};
        Set<Contact> contacts = manager.getContacts(ids);
        assertTrue(contacts.size() == ids.length);
    }

}
