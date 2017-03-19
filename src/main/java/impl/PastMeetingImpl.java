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
public class PastMeetingImpl extends MeetingImpl implements FutureMeeting {

    PastMeetingImpl(int id, Calendar date, Set<Contact> contacts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
