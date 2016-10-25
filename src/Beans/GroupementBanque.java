package Beans;

import java.util.ArrayList;

public class GroupementBanque
{
    /**
     * Attribut listeBanque : liste des banques rattachées au groupement
     */
    private ArrayList<Banque> listeBanque;

    /**
     * Attribut designation : chaine de caractère représentant la désignation du groupement
     */
    private String designation;

    /**
     * Constructeur vide de la classe Model.GroupementBanque.
     */
    public GroupementBanque()
    {
        listeBanque = new ArrayList<Banque>();
    }

    /**
     * Constructeur de la classe Model.GroupementBanque.
     * @param designation
     */
    public GroupementBanque(String designation)
    {
        this.designation = designation;
        listeBanque = new ArrayList<Banque>();
    }

    /**
     * Méthode SetDesignation permettant de modifier la designation du groupement.
     * @param designation
     */
    public void SetDesignation(String designation)
    {
        this.designation = designation;
    }

    /**
     * Méthode GetDesignation permenttant de récupérer la désignation du groupement.
     * @return designation
     */
    public String GetDesignation()
    {
        return designation;
    }

    /**
     * Méthode AddBanque peremttant d'ajouter une banque à la liste de banques du groupement.
     * @param b
     */
    public void AddBanque(Banque b)
    {
        listeBanque.add(b);
    }

    /**
     * Méthode GetBanque permettant de récupérer la banque à l'indice i dans la liste de banques.
     * @param i : indice.
     * @return banque.
     */
    public Banque GetBanque(int i)
    {
        if(i >= listeBanque.size() || i < 0)
            return null;
        else
            return listeBanque.get(i);
    }

    /**
     * Méthide GetBanque permettant de récupérer une banque en fonction de sa désignation.
     * @param designation
     * @return banque
     */
    public Banque GetBanque(String designation) {

        if (!this.listeBanque.isEmpty()) {
            for (int i = 0 ; i < this.listeBanque.size() ; i++) {
                if (this.listeBanque.get(i).getDesignation() == designation) {
                    return this.listeBanque.get(i);
                }
            }
        }

        return null;
    }

    /**
     * Méthode GetListeBanque permettant de récupérer la liste de banques du groupement.
     * @return listeBanque
     */
    public ArrayList<Banque> GetListeBanque()
    {
        return listeBanque;
    }
}
