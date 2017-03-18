package impl;

import spec.Contact;

/**
 * {@inheritDoc}
 *
 * @author Pedro Ferreira <pbf@frameweb.net>
 */
public class ContactImpl implements Contact {

    private int id;
    private String name;
    private String notes;

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
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNotes() {
        return this.notes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addNotes(String note) {
        if (!this.notes.equals("")) {
            this.notes = this.notes + "\n";
        }
        this.notes = this.notes + note;
    }

}
