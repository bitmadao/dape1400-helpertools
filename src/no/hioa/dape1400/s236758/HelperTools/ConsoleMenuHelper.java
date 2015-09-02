package no.hioa.dape1400.s236758.HelperTools;

/**
 * Created by dags on 20.08.15.
 */
public class ConsoleMenuHelper {
    private int nextMenuID ;

    public ConsoleMenuHelper() {
        this.nextMenuID = 1 ;
    }

    public int getNextMenuID() {
        return this.nextMenuID;
    }

    public int getPreviousMenuID() {
        return this.getNextMenuID() - 1;
    }

    private void increaseNextMenuID() {
        this.nextMenuID ++;
    }

    public String nextItem(String itemText) {
        String returnItem = "\t" + this.getNextMenuID() + ") " + itemText + "\n";
        this.increaseNextMenuID();
        return returnItem;
    }
}
