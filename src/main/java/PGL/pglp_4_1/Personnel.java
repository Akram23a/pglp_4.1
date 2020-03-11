package PGL.pglp_4_1;
import java.time.LocalDate;
import java.util.ArrayList;
public class Personnel {
	
	public String nom;
	public String prenom;
	public String fonction;
	public LocalDate dateNaissance;
	public ArrayList<NumTel> numsTel;
	
	public static class Builder {
		
		public String nom;
		public String prenom;
		public String fonction;
		public LocalDate dateNaissance;
		public ArrayList<NumTel> numsTelephone;
		
		public Builder(String nom, String prenom, String fonction, LocalDate dateNaissance) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonction = fonction;
			this.dateNaissance= dateNaissance;
		}
		
		public Builder numsTelephone(NumTel num) {
			this.numsTelephone.add(num);
			return this;
		}
		
		public Personnel build() {
			return new Personnel(this);
		}
	}
	private Personnel(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		dateNaissance = builder.dateNaissance;
		numsTel = builder.numsTelephone;
	}


}
