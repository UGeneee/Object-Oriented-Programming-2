package week6_constructor;

import java.util.Scanner;
import java.util.ArrayList;

public class RunBloodData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BloodData bd;

        ArrayList<String> btAllowed = new ArrayList<>();

        btAllowed.add("O");
        btAllowed.add("A");
        btAllowed.add("B");
        btAllowed.add("AB");

        ArrayList<String> rhSymbol = new ArrayList<>();

        rhSymbol.add("+");
        rhSymbol.add("-");

        System.out.print("Enter Patient Name: ");
        String pName = sc.nextLine().toUpperCase();
        if (pName.isEmpty()) {
            System.out.println("Please enter the patients name.");
            return;
        }

        System.out.print("Enter patient's blood type: ");
        String bType = sc.nextLine().toUpperCase();
        if (!btAllowed.contains(bType)) {
            System.out.println("Please enter a valid Blood Type.");
            return;
        }
        
        System.out.print("Enter the Rhesus Factor (+ or -): ");
        String rFactor = sc.nextLine();
        if (!rhSymbol.contains(rFactor)) {
            System.out.println(
                "Please enter either positive (+) or negative (-)."
            );
            return;
        }

        bd = new BloodData(pName, bType, rFactor);
        bd.display();
        bd.savePatientInfo();
        System.out.println("===== BLOOD BANK RECORDS =====");
        bd.displayPatient();
    }
}
