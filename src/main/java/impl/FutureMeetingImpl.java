package impl;

import java.util.Calendar;
import java.util.Set;
import spec.Contact;
import spec.FutureMeeting;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting {

    FutureMeetingImpl(int id, Calendar date, Set<Contact> contacts) {
        if (id < 1) {
            throw new IllegalArgumentException("Argument id must greater than zero.");
        }

        this.id = id;
        this.date = date;
        this.contacts = contacts;
    }

}
