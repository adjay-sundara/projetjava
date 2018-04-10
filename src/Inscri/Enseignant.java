package Inscri;

public class Enseignant extends Individus {
	private int idEnseignant;
	
	
	public int getIdEnseignant() {
		return idEnseignant;
	}


	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}


	public Enseignant(String nom, String prenom, char genre,
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
