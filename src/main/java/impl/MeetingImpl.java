package impl;

import java.util.Calendar;
import java.util.Set;
import spec.Contact;
import spec.Meeting;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
abstract public class MeetingImpl implements Meeting {

    protected int id;
    protected Calendar date;
    protected Set<Contact> contacts;

    /**
     * {@inheritDoc}
     */
    @Override
    public int getId() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Calendar getDate() {
        return this.date;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    
}
