package PGL.pglp_4_1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import PGL.pglp_4_1.Personnel.PBuilder;

public class PersonnelTest {

	public void Constructeur() {
    	
    			
        NumTel portable = new NumTel("0645343643");
        PBuilder b = new PBuilder("Try", "one", "job",LocalDate.of(1989, 10, 2));
        b.numsTelephone(portable);
        Personnel jobs = b.build();

        String nt = "0645343643";
        String n = "Try";
        String p = "one";
        String f = "job";

        LocalDate expDate = LocalDate.of(1989, 10, 2);

        assertEquals(nt,jobs.numsTel.get(0).numero);
        assertEquals(p, jobs.prenom);
        assertEquals(f, jobs.fonction);
        assertEquals(expDate, jobs.dateNaissance);
      assertEquals(n ,jobs.nom);

    }

}
