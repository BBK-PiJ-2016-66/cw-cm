package impl;

import java.util.Calendar;
import java.util.Set;
import spec.Contact;
import spec.PastMeeting;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class PastMeetingImpl extends MeetingImpl implements PastMeeting {

    PastMeetingImpl(int id, Calendar date, Set<Contact> contacts) {
        if (id < 1) {
            throw new IllegalArgumentException("Argument id must greater than zero.");
        }

        if (contacts.isEmpty()) {
            throw new IllegalArgumentException("Argument contacts can't be empty.");
        }

        this.id = id;
        this.date = date;
        this.contacts = contacts;
    }

    @Override
    public String getNotes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
