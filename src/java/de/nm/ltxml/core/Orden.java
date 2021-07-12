package de.nm.ltxml.core;

public class Orden extends Bezeichnung {
    public Orden() {
        super();
    }

    public Orden(String id, String bezeichnung) {
        super(id, bezeichnung);
    }

    @Override
    public String toString() {
        return "Orden: id="+this.id+", bezeichnung="+this.bezeichnung;
    }
}
