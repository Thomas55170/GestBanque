package Beans;

import java.util.ArrayList;

public class Banque
{
    /**
     * Attribut designation : designation de la banque.
     */
    private String designation;

    /**
     * Attribut listeSecteur : liste des secteurs où sont implémentées les agences de banque.
     */
    private ArrayList<Secteur> listeSecteur;

    /**
     * Constructeur vide la classe Model.Banque.
     */

    public Banque(){}

    /**
     * Constructeur de la classe Model.Banque.
     * @param designation
     */
    public Banque(String designation)
    {
        this.designation = designation;
        listeSecteur = new ArrayList<Secteur>();
    }

    /**
     * Méthode SetDesignation permettant de modifier la désignation de la banque.
     * @param designation
     */
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    /**
     * Méthode GetDesignation permettant de récupérer la désignation de la banque.
     * @return designation
     */
    public String getDesignation()
    {
        return designation;
    }

    /**
     * Méthode AddSecteur permettant d'ajouter une secteur à la liste de secteurs.
     * @param secteur
     */
    public void AddSecteur(Secteur secteur)
    {
        listeSecteur.add(secteur);
    }

    /**
     * Méthode GetListeSecteur peremttant de récupérer la liste de secteurs.
     * @return listeSecteur.
     */
    public ArrayList<Secteur> GetListeSecteur()
    {
        return listeSecteur;
    }
}
