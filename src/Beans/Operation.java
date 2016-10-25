package Beans;

import java.util.Date;

public class Operation {

	/* Variables */
	private Date dateDebut;
	private Date dateFin;
	private String typeOperation;

	private ClientBanque clientBanque;
	private Coffre coffre;
	private Frais frais;

	/* Constructors */
	public Operation() {
	}

	public Operation(Date aDateDebut, Date aDateFin, String aTypeOperation) {
		this.dateDebut = aDateDebut;
		this.dateFin = aDateFin;
		this.typeOperation = aTypeOperation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDebut(Date aDateDebut) {
		this.dateDebut = aDateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setFin(Date aDateFin) {
		this.dateFin = aDateFin;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String aTypeOperation) {
		this.typeOperation = aTypeOperation;
	}

	public Coffre getCoffre() {
		return coffre;
	}

	public void setCfre(Coffre aCoffre) {
		this.coffre = aCoffre;
	}

	public ClientBanque getClientBanque() {
		return clientBanque;
	}

	public void setClt(ClientBanque aClientBanque) {
		this.clientBanque = aClientBanque;
	}

	public Frais getFrais() {
		return frais;
	}

	public void setFrais(Frais aFrais) {
		this.frais = aFrais;
	}

}
