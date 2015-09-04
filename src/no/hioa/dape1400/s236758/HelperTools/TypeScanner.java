package no.hioa.dape1400.s236758.HelperTools;

import java.util.Scanner;

/**
 * Created by dags on 04.09.15.
 * Return various datatypes.
 * methods will run until a valid value can be parsed from string
 */
public class TypeScanner {
    private TypeScanner() {
        // do not initialize
    }

    public static int scanInt() {
        int scannedInt = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        String input ;

        while(true) {
            input = scanner.nextLine() ;
            if(input.matches("^[0-9]*$")) {
                scannedInt = Integer.parseInt(input) ;
                break ;
            }
        }

        return scannedInt ;
    }

    public static float scanFloat() {
        float scannedFloat  = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        String input ;

        while(true) {
            input = scanner.nextLine() ;
            if(input.matches("^([0-9]*.[0-9]*)||([0-9]*)$")) {
                scannedFloat = Float.parseFloat(input) ;
                break ;
            }
        }

        return scannedFloat ;
    }

    public static Double scanDouble() {
        double scannedDouble  = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        String input ;

        while(true) {
            input = scanner.nextLine() ;
            if(input.matches("^([0-9]*.[0-9]*)||([0-9]*)$")) {
                scannedDouble = Double.parseDouble(input) ;
                break ;
            }
        }

        return scannedDouble ;
    }

    public static boolean scanBoolean() {
        Scanner scanner = new Scanner(System.in) ;
        String input ;

        while(true) {
            input = scanner.nextLine() ;
            switch(input.toLowerCase()) {
                case "true":
                    return true ;
                case "false":
                    return false ;
                default:
                    System.out.println("Write true or false, please:");
            }
        }
    }


    public static boolean scanBoolean(String trueAlt, String falseAlt) {
        Scanner scanner = new Scanner(System.in) ;
        String input ;

        while(true) {
            input = scanner.nextLine() ;

            if(input.toLowerCase().equals(trueAlt.toLowerCase())) {
                return true ;
            } else if(falseAlt.toLowerCase().equals(falseAlt.toLowerCase())) {
                return false ;
            } else {
                System.out.printf("%s/%s", trueAlt, falseAlt);
            }
        }
    }
}
