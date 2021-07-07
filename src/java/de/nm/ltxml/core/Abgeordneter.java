package de.nm.ltxml.core;

import java.util.Date;

public class Abgeordneter extends Base {
    protected String name;
    protected String vorname;
    protected String titel;
    protected String beruf;
    protected Date gebam;
    protected String gebin;
    protected Date gesam;
    protected String gesin;
    protected Konfession konf;
    protected Familienstand fam;

    public Abgeordneter() {
        super();

        this.name ="??";
        this.vorname ="??";
    }

    public Abgeordneter(String id, String name, String vorname) {
        super(id);

        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public Date getGebam() {
        return gebam;
    }

    public void setGebam(Date gebam) {
        this.gebam = gebam;
    }

    public String getGebin() {
        return gebin;
    }

    public void setGebin(String gebin) {
        this.gebin = gebin;
    }

    public Date getGesam() {
        return gesam;
    }

    public void setGesam(Date gesam) {
        this.gesam = gesam;
    }

    public String getGesin() {
        return gesin;
    }

    public void setGesin(String gesin) {
        this.gesin = gesin;
    }

    public Konfession getKonf() {
        return konf;
    }

    public void setKonf(Konfession konf) {
        this.konf = konf;
    }

    public Familienstand getFam() {
        return fam;
    }

    public void setFam(Familienstand fam) {
        this.fam = fam;
    }

    @Override
    public String toString() {
        return "Abgeordneter: id="+this.id+", name="+this.name+", vorname="+this.vorname+", titel="+this.titel +", "
                + "beruf="+this.beruf+", gebam="+this.gebam+", "
                + "gebin="+this.gebin+", gesam="+this.gesam+", " + "gesin="+this.gesin+", konf="+this.konf+", fam="+this.fam;
    }
}
