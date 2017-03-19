package impl;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import spec.Contact;
import spec.Meeting;

/**
 * PastMeetingImplTest
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class PastMeetingImplTest {

    public PastMeetingImplTest() {
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
    public void testPastMethodWithIdAndDateAndContacts() {
        try {
            int id = 1;
            Calendar date = Calendar.getInstance();
            Set<Contact> contacts = new HashSet<>();
            Contact contac = new ContactImpl(1, "Pedro");
            contacts.add(contac);
            Meeting meeting = new PastMeetingImpl(id, date, contacts);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
