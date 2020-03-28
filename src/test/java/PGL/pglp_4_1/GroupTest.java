package PGL.pglp_4_1;


	import static org.junit.Assert.assertEquals;

	public class GroupTest {

	    public void addTest() {
	        GroupePersonnel g = new GroupePersonnel();
	        GroupePersonnel g2 = new GroupePersonnel();
	        g.add(g2);
	        assertEquals(g.getGroup().get(0), g2) ;


	    }
	
	    public void removeTest() {
	        GroupePersonnel g = new GroupePersonnel();
	        GroupePersonnel g2 = new GroupePersonnel();
	        GroupePersonnel g3 = new GroupePersonnel();
	        g.add(g2);
	        g.add(g3);
	        g.remove(g2);
	        assertEquals(g.getGroup().get(0), g3);
	    }
}