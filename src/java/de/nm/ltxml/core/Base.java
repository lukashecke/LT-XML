package de.nm.ltxml.core;

public abstract class Base {
    protected String id;

    public Base() {
    }

    public Base(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
