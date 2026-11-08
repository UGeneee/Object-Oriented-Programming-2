package week6_constructor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class BloodData {

    String bloodType;
    String rhFactor;
    String patientName;

    public BloodData() {
        this("Unknown", "O", "+");
    }

    public BloodData(String bt, String rh) {
        this("Unknown", bt, rh);
    }

    public BloodData(String pn, String bt, String rh) {
        patientName = pn;
        bloodType = bt;
        rhFactor = rh;
    }

    public void display() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Rhesus Factor: " + rhFactor);

        System.out.println(
            "Patient: " + patientName +
            " with blood type " + bloodType + rhFactor +
            " is added to the blood bank.\n"
        );
    }

    public void savePatientInfo() {

        try {
            FileWriter create = new FileWriter("Blood_Bank.txt", true);

            create.write("Patient Name: " + patientName + "\n");
            create.write("Patient Blood Type: " + bloodType + rhFactor + "\n");
            create.write("-----------\n");

            create.close();

        } catch (IOException e) {
            System.out.println("File cannot be created.");
        }
    }

    public void displayPatient() {

        try {
            File file = new File("Blood_Bank.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File cannot be read or found.");
        }
    }
}
