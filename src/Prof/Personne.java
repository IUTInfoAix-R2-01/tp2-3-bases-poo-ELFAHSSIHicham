package Prof;

public class Personne {
	private String nom; 
	private String prenom;
	
	public Personne(String prenom, String nom) {
		this.prenom = prenom;
		this.nom = nom;
		
	}
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		if (this.nom == null) {
			return "La personne n'a pas de nom !";
		}
		return this.nom;
	}
	
	public String getPrenom() {
		if (this.prenom == null) {
			return "La personne n'a pas de prénom !";
		}
		return prenom;
	}
	
	public String toString() {
		
		
		   return "Le nom est " + this.nom + " et le prénom est " + this.prenom ;
		}

}
