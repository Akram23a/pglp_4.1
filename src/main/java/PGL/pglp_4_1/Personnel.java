package PGL.pglp_4_1;
import java.time.LocalDate;
import java.util.ArrayList;
public class Personnel {
	
	private String nom;
	private String prenom;
	private String fonction;
	private LocalDate dateNaissance;
	private ArrayList<NumTel> numsTel;
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getFonction() {
		return fonction;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public ArrayList<NumTel> getNumsTel() {
		return numsTel;
	}
	public void setNumsTel(ArrayList<NumTel> numsTel) {
		this.numsTel = numsTel;
	}

}
