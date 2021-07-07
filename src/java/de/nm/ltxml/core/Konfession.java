package de.nm.ltxml.core;

public class Konfession extends Bezeichnung {
    public Konfession() {
        super();
    }

    public Konfession(String id, String bezeichnung) {
        super(id, bezeichnung);
    }

    @Override
    public String toString() {
        return "Konfession: id="+this.id+", bezeichnung="+this.bezeichnung+"";
    }
}
