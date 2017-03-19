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
            Meeting instance = new MeetingImplMock(id, date, contacts);            
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
     * Mock for abstract class MethodImpl
     */
    public class MeetingImplMock extends MeetingImpl {

        private MeetingImplMock(int id, Calendar date, Set<Contact> contacts) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
