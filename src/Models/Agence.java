package Models;

import java.util.ArrayList;

public class Agence
{

    /**
     * Attribut banque : banque de rattachement
     */
    private Banque banque;

    /**
     * Attrubut secteur : secteur de rattachement
     */
    private Secteur secteur;

    /**
     * Nom de l'agence
     */
    private String nom;

    /**
     * Adresse de l'agence
     * exemple: 3, rue charles
     */
    private String adresse;

    /**
     * Liste des coffres de l'agence
     */
    private ArrayList<Coffre> listeCoffre;

    /**
     * Liste des clients de l'agence
     */
    private ArrayList<ClientBanque> listeClient;


    /**
     * Constructeur vide de la classe Model.Agence. Instancie les listes ListeCoffre et ListeClient.
     */
    public Agence()
    {
        listeCoffre = new ArrayList<Coffre>();
        listeClient = new ArrayList<ClientBanque>();
    }

    /**
     * Constructeur de la classe Model.Agence.
     * @param nom : nom de l'agence
     * @param adresse : adresse de l'agence
     */
    public Agence(String nom, String adresse)
    {
        listeCoffre = new ArrayList<Coffre>();
        listeClient = new ArrayList<ClientBanque>();
        this.nom = nom;
        this.adresse = adresse;
    }

    /**
     * Méthode SetNom permettant de modifier le nom de l'agence
     * @param nom
     */
    public void SetNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * Méthode GetNom permettant de récupérer le nom de l'agence.
     * @return nom
     */
    public String GetNom()
    {
        return nom;
    }

    /**
     * Méthode GetAdresse permettant de récupérer l'adresse de l'agence.
     * @return adresse
     */
    public String GetAdresse()
    {
        return adresse;
    }

    /**
     * Méthode SetAdresse permettant de modifier l'adresse de l'agence.
     * @param adresse
     */
    public void SetAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    /**
     * Méthode AddCoffre permettant d'ajouter un coffre à la liste de coffres de l'agence.
     * @param coffre
     */
    public void AddCoffre(Coffre coffre)
    {
        listeCoffre.add(coffre);
    }

    /**
     * Méthode GetListeCoffre permettant de récupérer la liste de coffres de l'agence.
     * @return listeCoffre
     */
    public ArrayList<Coffre> GetListeCoffre()
    {
        return listeCoffre;
    }

    /**
     * Méthode GetListeClient permettant de récupérer la liste de clients de l'agence.
     * @return listeClient
     */
    public ArrayList<ClientBanque> GetListeClient()
    {
        return listeClient;
    }

    /**
     * Méthode AddClient permettant d'ajouter un client à la liste de clients de l'agence.
     * @param client
     */
    public void AddClient(ClientBanque client)
    {
        listeClient.add(client);
    }

    /**
     * Méthode GetBanque permettant de récupérer la banque de rattachement de l'agence
     * @return banque
     */
    public Banque GetBanque()
    {
        return banque;
    }

    /**
     * Méthode SetBanque permettant d'attacher une agence à une banque
     * @param banque
     */
    public void SetBanque(Banque banque)
    {
        this.banque = banque;
    }

    /**
     * Méthode permettant de récupérer le secteur de l'agence
     * @return secteur
     */
    public Secteur GetSecteur()
    {
        return secteur;
    }

    /**
     * Méthode permattant d'attacher une agence à un secteur
     * @param secteur
     */
    public void SetSecteur(Secteur secteur)
    {
        this.secteur = secteur;
    }

    /**
     * Méthode permettant d'afficher les informations de l'agence
     */
    public void AfficherBanque()
    {
        System.out.println("####Model.Agence " + GetNom() + " ####");
        if(banque != null)
            System.out.println("Model.Banque de rattachement de l'agence " + nom + " : " + GetBanque().getDesignation());
        else
            System.out.println("L'agence n'est pas rattaché à une banque");

        if(secteur != null)
            System.out.println("Model.Secteur de l'agence : " +  secteur.GetPays() + " " + secteur.GetVille());
        else
            System.out.println("L'agence n'est rattachée à aucun secteur");

        System.out.println("Il y a : " + listeClient.size() + " clients dans l'agence");
    }

    /**
     * Méthode permettant d'afficher la liste des client d'une agence
     */
    public void AfficherListeClients()
    {
        System.out.println("####Model.Agence " + GetNom() + " ####");
        for(int i = 0; i < listeClient.size(); i++)
        {
            System.out.println(i+"-"+listeClient.get(i).getPrenom()+ " " + listeClient.get(i).getNom());
        }
    }
}