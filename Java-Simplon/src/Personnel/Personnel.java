package Personnel;

public class Personnel {
	private String nom;
	private String matricule;
	private String societe;
	private int ht;
	private int hc;
	
	
	public Personnel(String nom,String matricule,String societe,int ht,int hc) {
		this.nom=nom;
		this.matricule=matricule;
		this.societe=societe;
		this.ht=ht;
		this.hc=hc;
	}
	
	public double indemnite() {
		double montant;
		if(hc>15) {
			montant=7000*hc;
		}
		else {
			montant=5000*hc;
		}
		System.out.println("l'indemnité est egal"+montant);
		
		return montant;
		
	}
	
	public double pension() {
		double pension,sal;
		double montant=0;
		sal=10000*ht;
		pension=sal+montant;
		System.out.println("la pension est"+pension);

		
		return montant;

		
		
	}
	
	public void imprimer() {
		System.out.println("Le nom est  "+nom+ "le matricule "  +matricule+ " la societe "+societe);
	}

}
