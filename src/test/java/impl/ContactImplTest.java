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
            ContactImpl contact = new ContactImpl(1, "Pedro");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
