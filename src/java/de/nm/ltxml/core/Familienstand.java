package de.nm.ltxml.core;

public class Familienstand extends Bezeichnung {
    public Familienstand() {
        super();
    }

    public Familienstand(String id, String bezeichnung) {
        super(id, bezeichnung);
    }

    @Override
    public String toString() {
        return "Familienstand: id="+this.id+", bezeichnung="+this.bezeichnung;
    }
}
