package atelier4_tache2;

public class SaisiPersonne {
	
	private String matricule;
	private String nom;
	private String prenom;
	private String adresse;
	private String dateNaissance;
	private String lieuNAissance;
	private int telephone;
	
	
	public SaisiPersonne(String matricule,String nom,String prenom,String adresse,String dateNaissance,String lieuNaissance,int telephone) {
		this.matricule=matricule;
		this.nom=nom;
     	this.prenom=prenom;
		this.adresse=adresse;
		this.dateNaissance=dateNaissance;
		this.lieuNAissance=lieuNaissance;
		this.telephone=telephone;	
	}
	
	public void afficher() {
		System.out.println("Voici les information de la personne"
				+ "\n la matricule  =>" +matricule+
				"\n Nom =>"+nom+
				"\n Pr�nom => " +prenom+
				"\n adresse =>"+adresse+
				"\n dateNaissance =>"+dateNaissance+
				"\n lieuNaissance =>"+lieuNAissance+
				"\n telephone =>" +telephone);
	}

}
