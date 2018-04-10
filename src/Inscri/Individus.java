package Inscri;

abstract class Individus {
	private int idIndividu;
	private String nom;
	private String prenom;
	private char genre;
	private String datedenaissance;
	private String lieudenaissance;
	private String telephoneFixe;
	private String telephoneMobile;

	public int getIdIndividu() {
		return idIndividu;
	}
	public void setIdIndividu(int idIndividu) {
		this.idIndividu = idIndividu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public char getGenre() {
		return genre;
	}
	public void setGenre(char genre) {
		this.genre = genre;
	}
	public String getDatedenaissance() {
		return datedenaissance;
	}
	public void setDatedenaissance(int day,int month, int year) {
		this.datedenaissance =""+day+"-"+month+"-"+year;
	}
	public String getLieudenaissance() {
		return lieudenaissance;
	}
	public void setLieudenaissance(String lieudenaissance) {
		this.lieudenaissance = lieudenaissance;
	}
	public String getTelephoneFixe() {
		return telephoneFixe;
	}
	public void setTelephoneFixe(String telephoneFixe) {
		this.telephoneFixe = telephoneFixe;
	}
	public String getTelephoneMobile() {
		return telephoneMobile;
	}
	public void setTelephoneMobile(String telephoneMobile) {
		this.telephoneMobile = telephoneMobile;
	}
	public String toString() {
		return "Individus [idIndividu=" + idIndividu + ", nom=" + nom
				+ ", prenom=" + prenom + ", genre=" + genre
				+ ", datedenaissance=" + datedenaissance + ", lieudenaissance="
				+ lieudenaissance + ", telephoneFixe=" + telephoneFixe
				+ ", telephoneMobile=" + telephoneMobile + "]";
	}
	


}
