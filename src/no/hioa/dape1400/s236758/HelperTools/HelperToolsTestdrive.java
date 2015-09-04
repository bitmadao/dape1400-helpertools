package no.hioa.dape1400.s236758.HelperTools;

/**
 * Created by dags on 03.09.15.
 */
public class HelperToolsTestdrive {
    public static void main(String[] args) {
        ConsoleMenuHelper cmh = new ConsoleMenuHelper("Testing 1,2,3") ;
        cmh.addItem("testing enterToContinue()", () -> QuitHelper.enterToContinue());

        System.out.println("Testing three two one") ;
        cmh.runMenu();

        System.out.print("scanInt(): ");
        int scanInt = TypeScanner.scanInt() ;
        System.out.println("scanInt = " + scanInt) ;
        System.out.print("scanFloat(): ");
        float scanFloat = TypeScanner.scanFloat();
        System.out.println("scanFloat = " + scanFloat);
        System.out.print("scanDouble(): ") ;
        double scanDouble = TypeScanner.scanDouble() ;
        System.out.println("scanDouble = " + scanDouble) ;

    }

    private HelperToolsTestdrive() {
        // do nothing
    }
}
