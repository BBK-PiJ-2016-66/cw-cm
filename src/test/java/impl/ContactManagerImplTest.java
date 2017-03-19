package impl;

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

}
