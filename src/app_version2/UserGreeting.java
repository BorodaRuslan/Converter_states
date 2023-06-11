package app_version2;

import java.util.Scanner;

public class UserGreeting {
    final Scanner scanner = new Scanner(System.in);

    public void greeting() throws InterruptedException {
        System.out.println("Welcome to the conversion app!");
        Thread.sleep(1000);
        System.out.println("Choose what to convert");
        Thread.sleep(1000);

        while (true) {
            System.out.println("Please enter a number (1) if we are converting miles or a number (2) if we are converting kilometers!");
            int input = scanner.nextInt();

            if (input == 1) {
                new ConvertMilesToKms().convertLength();
                break;
            } else if (input == 2) {
                new ConvertKmsToMiles().convertLength();
                break;
            } else {
                System.out.println("Error invalid input");
            }
        }

    }
}
