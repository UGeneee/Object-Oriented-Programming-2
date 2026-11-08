package week7_encap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHelper {

    public void savePatientInfo(BloodData bd) {
        try {
            FileWriter create = new FileWriter("Blood_Bank.txt", true);

            create.write("Patient Name: " + bd.getPatientName() + "\n");
            create.write("Patient Blood Type: " + bd.getBloodType() + bd.getRhFactor() + "\n");
            create.write("-----------\n");

            create.close();

        } catch (IOException e) {
            System.out.println("File cannot be created.");
        }
    }

    public void displayPatient(BloodData bd) {

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
