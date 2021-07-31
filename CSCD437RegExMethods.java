import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSCD437RegExMethods {

    public static void easySSNPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^[\\d\\s\\-]{9,11}$");
        printValidity(isValid, fout);

    }// end easySSN

    public static void mediumEasySSNPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^\\d{3}[\\s\\-]?\\d{2}[\\s\\-]?\\d{4}$");
        printValidity(isValid, fout);
    }// end mediumEasySSN

    public static void newSSNPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("");
        printValidity(isValid, fout);
    }// end newSSN

    public static void phonePatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^(?:\\+1)? ?(?:\\(\\d{3}\\)|\\d{3})\\-?\\d{3}\\-?\\d{4}$");
        printValidity(isValid, fout);
    }// end phoneNumber

    public static void emailPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^([a-z]+\\.?[a-z]+)@[a-z]+\\.[a-z]+$");
        printValidity(isValid, fout);
    }// end email

    public static void namePatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^[A-Z][a-z]+, [A-Z][a-z]+(?: [A-Z])*$");
        printValidity(isValid, fout);
    }// end name

    public static void datePatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^(?:0?[1-9]|1[0-2])[\\-\\/](?:0?[1-9]|[1-2][0-9]|3[0-1])[\\-\\/](?:1[0-9]{3}|2[0-9]{3})$");
        printValidity(isValid, fout);
    }// end date

    public static void addressPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("");
        printValidity(isValid, fout);
    }// end address

    public static void cityStateZipPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^(?:[A-Za-z][A-Za-z \\-.]*).? [A-Z]{2} \\d{5}(?:\\-\\d{4})?$");
        printValidity(isValid, fout);
    }//end cityStateZip

    public static void militaryTimePatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^(?:0\\d|1\\d|2[0-3]):(?:[0-5]\\d):(?:[0-5]\\d)$");
        printValidity(isValid, fout);
    }// end militaryTime

    public static void moneyPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^\\$\\d{1,3}(?:,\\d{3})*.\\d{2}$");
        printValidity(isValid, fout);
    }// end money

    public static void urlPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^(?:http:\\/\\/|https:\\/\\/)?(?:[a-z]+\\.)?[a-z]+\\.[a-z]+(?:\\/\\w+)?$");
        printValidity(isValid, fout);
    }// end URL

    public static void passwordPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("");
        printValidity(isValid, fout);
    }// end password

    public static void evenErPatternTester(final String str, final PrintStream fout) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Bad str Parameter to the method");
        }
        fout.println(str);
        boolean isValid = str.matches("^([A-Za-z]{2}){1,}(?:e|E)(?:r|R)$");
        printValidity(isValid, fout);
    }// end oddIon
    
    private static void printValidity(boolean isValid, final PrintStream fout)
    {
        if(isValid) fout.println("valid");
        else fout.println("not valid");
    }

}// end class
