package service;

public class Compte {
	int code,dateCreation;
	double solde;

	public Compte(int code, double solde, int dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public int getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(int dateCreation) {
		this.dateCreation = dateCreation;
	}

}
