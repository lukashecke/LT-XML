package de.nm.ltxml.core;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name="baylandtag")
@XmlAccessorType(XmlAccessType.FIELD)
public class BayLandtag {

    @XmlElement(name="fam")
    @XmlElementWrapper(name="familie")
    protected ArrayList<Familienstand> familienstandData= new ArrayList<>();
    @XmlElement(name="konf")
    @XmlElementWrapper(name="konfession")
    protected ArrayList<Konfession> konfessionData= new ArrayList<>();
    @XmlElement(name="abg")
    @XmlElementWrapper(name="abgeordnete")
    protected ArrayList<Abgeordneter> abgeordneterData= new ArrayList<>();

    public void add(Familienstand fam) {
        familienstandData.add(fam);
    }
    public void add(Konfession konf) {
        konfessionData.add(konf);
    }
    public void add(Abgeordneter abg) {
        abgeordneterData.add(abg);
    }
}
