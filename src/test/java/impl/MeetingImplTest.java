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
 * MeetingImplTest
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class MeetingImplTest {

    public MeetingImplTest() {
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
    public void testMethodWithIdAndDateAndContacts() {
        try {
            int id = 1;
            Calendar date = Calendar.getInstance();
            Set<Contact> contacts = new HashSet<>();
            Meeting meeting = new MeetingImplMock(id, date, contacts);
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testMethodWithIdAndDateAndContactsRaisesExceptionOnInvalidId() {
        try {
            int id = 0;
            Calendar date = Calendar.getInstance();
            Set<Contact> contacts = new HashSet<>();
            Meeting meeting = new MeetingImplMock(id, date, contacts);
            fail("Missing exception!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testGetId() {
        int id = 0;
        Calendar date = Calendar.getInstance();
        Set<Contact> contacts = new HashSet<>();
        Meeting meeting = new MeetingImplMock(id, date, contacts);
        assertEquals(1, meeting.getId());
    }

    /**
     * Mock for abstract class MethodImpl
     */
    public class MeetingImplMock extends MeetingImpl {
        private int id;
        private Calendar date;
        private Set<Contact> contacts;

        private MeetingImplMock(int id, Calendar date, Set<Contact> contacts) {
            if (id < 1) {
                throw new IllegalArgumentException("Argument id must greater than zero.");
            }

            this.id = id;
            this.date = date;
            this.contacts = contacts;
        }
    }

}
