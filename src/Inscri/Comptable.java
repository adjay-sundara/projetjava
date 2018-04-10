package Inscri;

public class Comptable extends Individus {
	private int idComptable;
	
	
	public int getIdComptable() {
		return idComptable;
	}
	public void setIdComptable(int idComptable) {
		this.idComptable = idComptable;
	}

	public Comptable(String nom, String prenom, char genre,
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
