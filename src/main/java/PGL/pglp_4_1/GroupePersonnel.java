package PGL.pglp_4_1;

import java.util.ArrayList;
import java.util.Iterator;

public class GroupePersonnel implements Component{
	
    private final ArrayList<Component> childComp = new ArrayList<Component>();
    
    public void add(Component comp) {
    	childComp.add(comp);
    }
    public void remove(final Component C) {
    	childComp.remove(C);
    }
    public void print() {
        for (Component cm : childComp) {
            cm.print(); 
        }
    }
    public ArrayList<Component> getGroup(){
    	return childComp;
    }
    // Iterator
	public Iterator<Component> iterator() {
		
		return childComp.iterator();
	}
}
