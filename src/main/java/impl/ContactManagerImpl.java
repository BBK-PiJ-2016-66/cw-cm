package impl;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spec.Contact;
import spec.ContactManager;
import spec.FutureMeeting;
import spec.Meeting;
import spec.PastMeeting;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class ContactManagerImpl implements ContactManager {

    private int lastContactId;
    private Map<Integer, Contact> contacts;

    /**
     * Constructor
     */
    ContactManagerImpl() {
        this.lastContactId = 0;
        this.contacts = new HashMap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int addFutureMeeting(Set<Contact> contacts, Calendar date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PastMeeting getPastMeeting(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FutureMeeting getFutureMeeting(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Meeting getMeeting(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Meeting> getFutureMeetingList(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Meeting> getMeetingListOn(Calendar date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<PastMeeting> getPastMeetingListFor(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int addNewPastMeeting(Set<Contact> contacts, Calendar date, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PastMeeting addMeetingNotes(int id, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int addNewContact(String name, String notes) {
        this.lastContactId++;
        Contact contact = new ContactImpl(this.lastContactId, name, notes);
        this.contacts.put(this.lastContactId, contact);
        return contact.getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Contact> getContacts(String name) {
        Set<Contact> contacts = new HashSet();
        Iterator iterator = this.contacts.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Contact contact = (Contact) entry.getValue();
            if (contact.getName().equals(name)) {
                contacts.add(contact);
            }
        }
        return contacts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Contact> getContacts(int... ids) {
        Set<Contact> contacts = new HashSet();
        for (int i = 0; i < ids.length; i++) {
            if (this.contacts.keySet().contains(ids[i])) {
                contacts.add(this.contacts.get(ids[i]));
            }
        }
        return contacts;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
