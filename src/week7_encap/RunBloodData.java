package week7_encap;

import java.util.Scanner;
import java.util.ArrayList;

public class RunBloodData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        FileHelper fileHelper = new FileHelper();

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
            System.out.println("Please Enter Patient Name.");
            return;
        } else {
            bd.setPatientName(pName);
        }

        System.out.print("Enter patient's blood type: ");
        String bType = sc.nextLine().toUpperCase();

        System.out.print("Enter the Rhesus Factor (+ or -): ");
        String rFactor = sc.nextLine();

        if (btAllowed.contains(bType)) {
            bd.setBloodType(bType);
        } else {
            bd = new BloodData();
        }

        if (rhSymbol.contains(rFactor)) {
            bd.setRhFactor(rFactor);
        } else {
            bd = new BloodData();
        }

        display(bd);
        fileHelper.savePatientInfo(bd);
        System.out.println("===== BLOOD BANK RECORDS =====");
        fileHelper.displayPatient(bd);
    }

    public static void display(BloodData bd) {
        System.out.println("Patient Name: " + bd.getPatientName());
        System.out.println("Blood Type: " + bd.getBloodType());
        System.out.println("Rhesus Factor: " + bd.getRhFactor());

        System.out.println(
                "Patient: " + bd.getPatientName()
                + " with blood type " + bd.getBloodType() + bd.getRhFactor()
                + " is added to the blood bank.\n"
        );
    }
}
