package PGL.pglp_4_1;

import java.util.ArrayList;

public class GroupePersonnel implements Component{
    private final ArrayList<Component> childComp = new ArrayList<Component>();

    public void add(Component comp) {
    	childComp.add(comp);
    }
    
    public void print() {
        for (Component graphic : childComp) {
            graphic.print(); 
        }
    }

}
