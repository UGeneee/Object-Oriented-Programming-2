package week9_interface;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Monday extends Weekday {

    String time;

    @Override
    public void setAlarm(String time) {
        this.time = time;
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();

        if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tomorrow!");
        } else {
            System.out.println("I'll wake you up later!");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Monday monday = new Monday();
        try {
            System.out.print("Enter time for alarm in this format (HH:MM): ");
            String time = sc.nextLine();

            monday.setAlarm(time);
            monday.showAlarm();
        } catch (DateTimeParseException e) {
            System.out.println("Please enter the proper format.");
        }

    }
}
