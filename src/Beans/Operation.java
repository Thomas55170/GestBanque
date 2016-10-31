package Beans;

import java.util.Date;

import javax.xml.bind.annotation.*;

@XmlRootElement(name =  "Operation")
@XmlType(propOrder = {"dateDebut", "dateFin", "typeOperation", "clientBanque", "coffre", "frais", "montant"})
@XmlAccessorType(XmlAccessType.NONE)



public class Operation {

	/* Variables */
	@XmlElement(name = "dateDebut")
	private Date dateDebut;
	@XmlElement(name = "dateFin")
	private Date dateFin;
	@XmlElement(name = "typeOperation")
	private String typeOperation;
    @XmlElement(name = "clientBanque")
	private int clientBanque;
    @XmlElement(name = "coffre")
	private int coffre;
    @XmlElement(name = "frais")
	private int frais;
	@XmlElement(name = "montant")
	private int montant;


	/* Constructors */
	public Operation() {
	}

	public Operation(Date aDateDebut, Date aDateFin, String aTypeOperation, Integer aMontant) {
		this.dateDebut = aDateDebut;
		this.dateFin = aDateFin;
		this.typeOperation = aTypeOperation;
		this.montant = aMontant;
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

	public Integer getMontant() {
		return montant;
	}

	public void setMontant(Integer aMontant) {
		this.montant = aMontant;
	}

	public int getCoffre() {
		return coffre;
	}

	public void setCfre(int aCoffre) {
		this.coffre = aCoffre;
	}

	public int getClientBanque() {
		return clientBanque;
	}

	public void setClt(int aClientBanque) {
		this.clientBanque = aClientBanque;
	}

	public int getFrais() {
		return frais;
	}

	public void setFrais(int aFrais) {
		this.frais = aFrais;
	}


	@Override
	public String toString() {
		return this.dateDebut + " " + this.dateFin + " "+ this.typeOperation;
	}
}
