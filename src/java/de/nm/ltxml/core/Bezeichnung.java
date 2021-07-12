package de.nm.ltxml.core;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

public abstract class Bezeichnung extends Base {
    @XmlAttribute(name="bezeichnung")
    protected String bezeichnung;

    public Bezeichnung() {
        this.bezeichnung = "??";
    }

    public Bezeichnung(String id) {
        this.id = id;
    }

    public Bezeichnung(String id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
