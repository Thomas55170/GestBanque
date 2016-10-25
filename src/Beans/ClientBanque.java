package Beans;

import javax.xml.bind.annotation.*;

@XmlRootElement(name =  "ClientBanque")
@XmlType(propOrder = {"nom", "prenom"})
@XmlAccessorType(XmlAccessType.NONE)
public class ClientBanque {

    @XmlElement(name = "Nom")
    private String nom;
    @XmlElement(name = "Prenom")
    private String prenom;
    private Agence agenceRattachement;
    private Boolean estClient;
    private Coffre coffre;


    public ClientBanque(String aNom, String aPrenom, Boolean estClient, Agence aAgence, Coffre aCoffre) {
        this.nom = aNom;
        this.prenom = aPrenom;
        this.agenceRattachement = aAgence;
        this.coffre = aCoffre;
        this.estClient = estClient;
    }

    /**
     * Getter
     */
    public ClientBanque() {}

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

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

    public void setAgenceRattachement(Agence agr) {
        this.agenceRattachement = agr;
    }

    @Override
    public String toString() {
        return this.prenom + " " + this.nom;
    }

}
