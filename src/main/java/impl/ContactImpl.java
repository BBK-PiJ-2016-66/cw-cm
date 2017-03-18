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
        if (id < 1) {
            throw new IllegalArgumentException("Argument id must greater than zero.");
        }

        this.id = id;
        this.name = name;
        this.notes = notes;
    }

    ContactImpl(int id, String name) {
        if (id < 1) {
            throw new IllegalArgumentException("Argument id must greater than zero.");
        }

        this.id = id;
        this.name = name;
        this.notes = "";
    }

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
