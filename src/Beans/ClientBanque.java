package Beans;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name =  "ClientBanque")
@XmlType(propOrder = {"id", "nom", "prenom", "mesCoffres"})
@XmlAccessorType(XmlAccessType.NONE)
public class ClientBanque {

    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "Nom")
    private String nom;
    @XmlElement(name = "Prenom")
    private String prenom;

    private Agence agenceRattachement;
    private Boolean estClient;

    @XmlElement(name = "MesCoffres", type= MesCoffres.class)
    private List<MesCoffres> mesCoffres;


    public ClientBanque(String aNom, String aPrenom, Boolean estClient, Agence aAgence, List<MesCoffres> MesCoffres) {
        this.nom = aNom;
        this.prenom = aPrenom;
        this.agenceRattachement = aAgence;
        this.mesCoffres = MesCoffres;
        this.estClient = estClient;
    }

    /**
     * Getter
     */
    public ClientBanque() {}

    public int getId() {
        return this.id;
    }
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }

    public List<MesCoffres> getMesCoffres(){return this.mesCoffres;}

    public Boolean getEstClient() {
        return this.estClient;
    }

    public Agence getAgenceRattachement() {
        return this.agenceRattachement;
    }

    /**
     * Setter
     */
    public void setNom(String nm) {
        this.nom = nm;
    }

    public void setPrenom(String pn) {
        this.prenom = pn;
    }

    public void  setMesCoffres(List<MesCoffres> mesCoffres){
        this.mesCoffres = mesCoffres;
    }

    public void setAgenceRattachement(Agence agr) {
        this.agenceRattachement = agr;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

}


