package no.hioa.dape1400.s236758.HelperTools;

import java.util.Scanner;

/**
 * Created by dags on 31.08.15.
 */
public class QuitHelper {
    private QuitHelper() {
        // class should not be instantiated
    }
    public static void enterToContinue() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Press enter to continue.") ;
        scanner.nextLine() ;
    }
    public static void enterToContinue(String customString) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(customString) ;
        scanner.nextLine() ;
    }


}
