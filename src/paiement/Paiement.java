package paiement;

public class Paiement {
	private int idAffectation;
	private int idEtudiant;
	private int idTarif;
	private String datePaiement;
	private double MontantPaiement;
	private String modePaiement;
	
	public int getIdAffectation() {
		return idAffectation;
	}
	public void setIdAffectation(int idAffectation) {
		this.idAffectation = idAffectation;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public int getIdTarif() {
		return idTarif;
	}
	public void setIdTarif(int idTarif) {
		this.idTarif = idTarif;
	}
	public String getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(String datePaiement) {
		this.datePaiement = datePaiement;
	}
	public double getMontantPaiement() {
		return MontantPaiement;
	}
	public void setMontantPaiement(double montantPaiement) {
		MontantPaiement = montantPaiement;
	}
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	

}
