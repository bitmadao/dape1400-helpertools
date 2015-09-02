package no.hioa.dape1400.s236758.HelperTools;

import java.util.ArrayList;


/**
 * Created by dags on 20.08.15.
 */
public class ConsoleMenuHelper {
    private int nextMenuID ;
    private ArrayList<Runnable> methods ;
    private int methodSize ;
    private StringBuilder dashboard ;

    public ConsoleMenuHelper(String menuName) {
        this.dashboard = new StringBuilder().append(menuName).append("\n");
        this.methods = new ArrayList<>() ;
        this.nextMenuID = 1 ;
    }

    public void addItem(String menuText, Runnable methodName) {
        this.dashboard.append(menuItemText(menuText)) ;
        this.methods.add(this.getNextMenuID(), methodName);
        this.increaseNextMenuID();
    }

    public int getNextMenuID() {
        return this.nextMenuID;
    }

    public int getMethodSize() {
        this.methodSize = this.methods.size() ;
        return methodSize ;
    }
    public Runnable getMethod(int index) {
        return methods.get(index) ;
    }

    public int getPreviousMenuID() {
        return this.getNextMenuID() - 1;
    }

    private void increaseNextMenuID() {
        this.nextMenuID ++;
    }

    public String menuItemText(String itemText) {
        return String.format("\t%d) %s\n",this.getNextMenuID(), itemText);
    }
}
