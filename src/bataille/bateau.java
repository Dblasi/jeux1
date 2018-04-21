package bataille;

public class bateau {
	
	private point coorDebut;
	private point coorFin;
	private int taille; 
	
	public bateau( int c){
		//this.coorDebut = ;
		//this.coorFin = ;
		this.taille = c;
	}
	
	public void setCoorDebut(point coorDebut ) {
		this.coorDebut = coorDebut;	
	}
	
	public void setCoorFin(point coorFin ) {
		this.coorFin = coorFin;	
	}
	
	public void setTaille(int taille ) {
		this.taille = taille;	
	}
	
	public point getCoorDebut() {
		return this.coorDebut;
	}
	
	public point getCoorFin() {
		return this.coorFin;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	
	
	
	
}

