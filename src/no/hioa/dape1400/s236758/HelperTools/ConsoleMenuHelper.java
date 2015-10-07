package no.hioa.dape1400.s236758.HelperTools;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by dags on 20.08.15.
 */
public class ConsoleMenuHelper {
    private int nextMenuID ;
    private Map<Integer, Runnable> methods ;
    private StringBuilder dashboard ;

    public ConsoleMenuHelper(String menuName) {
        this.dashboard = new StringBuilder().append(menuName).append("\n");
        this.methods = new HashMap<>() ;
        this.nextMenuID = 1 ;
    }

    public void addItem(String menuText, Runnable methodName) {
        this.dashboard.append(menuItemText(menuText)) ;
        this.methods.put(this.getNextMenuID(), methodName);
        this.increaseNextMenuID();
    }

    public int getNextMenuID() {
        return this.nextMenuID;
    }

    public int getMethodSize() {
        return this.methods.size() ;
    }
    private Runnable getMethod(int index) {
        return methods.get(index) ;
    }

    private void increaseNextMenuID() {
        this.nextMenuID ++;
    }

    private String menuItemText(String itemText) {
        return String.format("\t%d) %s\n",this.getNextMenuID(), itemText);
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in) ;
        String input ;
        String finalDashboard ;
        int intForMenu ;
        boolean keepGoing = true ;

        if(this.getMethodSize() == 0) {
            System.out.println("No menu items added..") ;
            return ;
        }

        if(this.getMethodSize() > 1) {
            finalDashboard = String.format("%s \nInput integer between 1 and %d (or nothing) then press \"Enter\"",
                    dashboard, this.getMethodSize()) ;
        } else {
            finalDashboard = String.format("%s \nInput integer 1 (or nothing) then press \"Enter\"",
                    dashboard) ;
        }

        while(keepGoing) {
            System.out.println(finalDashboard);
            input = scanner.nextLine();
            if(input.toString().isEmpty()) {
                keepGoing = false ;
                continue ;
            }

            if (input.matches("^[0-9]*")) {
                intForMenu = Integer.parseInt(input);

                if(intForMenu <= this.getMethodSize()) {
                    this.getMethod(intForMenu).run();
                }
            }

            System.out.println("Unrecognized input") ;
        }
    }
}