package Models;

import java.util.List;

public class Coffre {
	private int id;
	private String localisation;
	private String typeCoffre;
	private String typeSecurite;
	private ClientBanque client;
	private double montant;
	private List<Operation> operations;

	// constructeurs

	public Coffre(int id, String loc, String typec, String types, ClientBanque cl, double montant,
			List<Operation> lesOperations) {
		this.id = id;
		this.localisation = loc;
		this.typeCoffre = typec;
		this.typeSecurite = types;
		this.client = cl;
		this.montant = montant;
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

	public double getMontant() {
		return this.montant;
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

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public void setOperation(Operation ope) {
		this.operations.add(ope);
	}

	// Methodes

	public void afficheOperations() {
		System.out.println("Liste des op�rations du coffre n�" + this.id);
		for (Operation operation : this.getOperations()) {
			System.out.println("\n " + operation.getTypeOperation() + " effectu� par "
					+ operation.getClientBanque().getPrenom() + " " + operation.getClientBanque().getNom()
					+ ", d�but : " + operation.getDateDebut() + ", fin " + operation.getDateFin());
		}
	}
}