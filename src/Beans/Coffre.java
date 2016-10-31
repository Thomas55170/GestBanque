package Beans;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name =  "CoffreBoutique")
@XmlType(propOrder = {"id", "localisation", "typeCoffre", "typeSecurite", "frais"})
@XmlAccessorType(XmlAccessType.NONE)
public class Coffre {

	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "localisation")
	private String localisation;
	@XmlElement(name = "typeCoffre")
	private String typeCoffre;
	@XmlElement(name = "typeSecurite")
	private String typeSecurite;
	@XmlElement(name = "frais")
	private double frais;

	private ClientBanque client;

	private List<Operation> operations;

	// constructeurs

	public Coffre(int id, String loc, String typec, String types, ClientBanque cl, double frais,
			List<Operation> lesOperations) {
		this.id = id;
		this.localisation = loc;
		this.typeCoffre = typec;
		this.typeSecurite = types;
		this.client = cl;
		this.frais = frais;
		this.operations = lesOperations;
	}

	public Coffre() {

	}

	// getter
	public int getId() {
		return this.id;
	}

	public String getLocalisation() {
		return this.localisation;
	}

	public String getTypeCoffre() {
		return this.typeCoffre;
	}

	public String getTypeSecurite() {
		return this.typeSecurite;
	}

	public ClientBanque getClient() {
		return this.client;
	}

	public double getFrais() {
		return this.frais;
	}

	public List<Operation> getOperations() {
		return this.operations;
	}

	// setter

	public void setId(int identifiant) {
		this.id = identifiant;
	}

	public void setLocalisation(String loc) {
		this.localisation = loc;
	}

	public void setTypeCoffre(String tCoffre) {
		this.typeCoffre = tCoffre;
	}

	public void setTypeSecurite(String tSecurite) {
		this.typeSecurite = tSecurite;
	}

	public void setClient(ClientBanque iClient) {
		this.client = iClient;
	}

	public void setFrais(double frais) {
		this.frais = frais;
	}

	public void setOperation(Operation ope) {
		this.operations.add(ope);
	}

	// Methodes

	/*public void afficheOperations() {
		System.out.println("Liste des op�rations du coffre n�" + this.id);
		for (Operation operation : this.getOperations()) {
			System.out.println("\n " + operation.getTypeOperation() + " effectu� par "
					+ operation.getClientBanque().getPrenom() + " " + operation.getClientBanque().getNom()
					+ ", début : " + operation.getDateDebut() + ", fin " + operation.getDateFin());
		}
	}*/
}