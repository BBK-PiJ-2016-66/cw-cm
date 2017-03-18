package impl;

import spec.Contact;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class ContactImpl implements Contact {

    private final int id;
    private final String name;
    private final String notes;

    ContactImpl(int id, String name, String notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNotes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addNotes(String note) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
