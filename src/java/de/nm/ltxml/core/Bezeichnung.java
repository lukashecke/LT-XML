package de.nm.ltxml.core;

public abstract class Bezeichnung extends Base {
    protected String bezeichnung;

    public Bezeichnung() {
    }

    public Bezeichnung(String id) {
    }

    public Bezeichnung(String id, String bezeichnung) {
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        return "";
    }
}
