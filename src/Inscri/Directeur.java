package Inscri;

public class Directeur extends Individus{
	private int idDirecteur;
	
	
	public int getIdDirecteur() {
		return idDirecteur;
	}

	public void setIdDirecteur(int idDirecteur) {
		this.idDirecteur = idDirecteur;
	}

	public Directeur(String nom, String prenom, char genre,
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
