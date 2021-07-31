
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSCD437RegexMainTester {

    public static BufferedReader bufferedReader;
    public static FileReader fileReader;

    public static void main(String[] args) throws IOException {
        int choice = 0;
        String str = "";
        openFile();
        printMenu();
        String fileInput = ""; 
        while((fileInput = bufferedReader.readLine()) != null) {
            
            if ("exit".equals(fileInput)) {
                choice = 0;
            }
            else if (choice == 0) {
                choice = Integer.parseInt(fileInput);
                System.out.println("Testing choice: " + choice);
            } else {
                str = fileInput;
                switch (choice) {
                    case 1:
                        CSCD437RegExMethods.easySSNPatternTester(str, System.out);
                        break;
                    case 2:
                        CSCD437RegExMethods.mediumEasySSNPatternTester(str, System.out);
                        break;
                    case 3:
                        CSCD437RegExMethods.newSSNPatternTester(str, System.out);
                        break;
                    case 4:
                        CSCD437RegExMethods.phonePatternTester(str, System.out);
                        break;
                    case 5:
                        CSCD437RegExMethods.emailPatternTester(str, System.out);
                        break;
                    case 6:
                        CSCD437RegExMethods.namePatternTester(str, System.out);
                        break;
                    case 7:
                        CSCD437RegExMethods.datePatternTester(str, System.out);
                        break;
                    case 8:
                        CSCD437RegExMethods.addressPatternTester(str, System.out);
                        break;
                    case 9:
                        CSCD437RegExMethods.cityStateZipPatternTester(str, System.out);
                        break;
                    case 10:
                        CSCD437RegExMethods.militaryTimePatternTester(str, System.out);
                        break;
                    case 11:
                        CSCD437RegExMethods.moneyPatternTester(str, System.out);
                        break;
                    case 12:
                        CSCD437RegExMethods.urlPatternTester(str, System.out);
                        break;
                    case 13:
                        CSCD437RegExMethods.passwordPatternTester(str, System.out);
                        break;
                    case 14:
                        CSCD437RegExMethods.evenErPatternTester(str, System.out);
                        break;
                }
            }
        };

        closeFile();

    }//end main

    private static void openFile() throws FileNotFoundException {
         var currentDirectoryPath = System.getProperty("user.dir");
         var fileName = "testcases.txt";

        fileReader = new FileReader(new File(currentDirectoryPath, fileName));
        bufferedReader = new BufferedReader(fileReader);
    }

    private static void closeFile() throws IOException {
        bufferedReader.close();
        fileReader.close();
    }

    private static void printMenu() {
        System.out.println(" 1) Easy SSN");
        System.out.println(" 2) Medium Easy SSN");
        System.out.println(" 3) New SSN");
        System.out.println(" 4) US Phone Number");
        System.out.println(" 5) E-mail Address");
        System.out.println(" 6) Name on Class Roster");
        System.out.println(" 7) Date MM-DD-YYYY");
        System.out.println(" 8) House Address");
        System.out.println(" 9) City, State Zip");
        System.out.println("10) Military Time");
        System.out.println("11) US Currency");
        System.out.println("12) URL");
        System.out.println("13) Password");
        System.out.println("14) Even er");
    }// end menu

}// end class
