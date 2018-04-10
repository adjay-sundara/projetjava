package Inscri;


public class Secretaire extends Individus {
	private int idSecretaire;
	
	
	public int getIdSecretaire() {
		return idSecretaire;
	}

	public void setIdSecretaire(int idSecretaire) {
		this.idSecretaire = idSecretaire;
	}

	public Secretaire(String nom, String prenom, char genre,
			int jj,int mm,int yyyy, String lieudenaissance, String telephoneFixe,
			String telephoneMobile) {
		super();
		super.setNom(nom);
		super.setPrenom(prenom);
		super.setGenre(genre);
		super.setDatedenaissance(jj,mm,yyyy);
		super.setLieudenaissance(lieudenaissance);
		super.setTelephoneFixe(telephoneFixe);
		super.setTelephoneMobile(telephoneMobile);
	}

}
