package no.hioa.dape1400.s236758.HelperTools;

/**
 * Created by dags on 03.09.15.
 */
public class HelperToolsTestdrive {
    public static void main(String[] args) {
        ConsoleMenuHelper cmh = new ConsoleMenuHelper("Testing 1,2,3") ;
        cmh.addItem("testing one two three", () ->QuitHelper.enterToContinue());

        System.out.println("Testing three two one") ;
        cmh.runMenu();
    }

    private HelperToolsTestdrive() {
        // do nothing
    }
}
