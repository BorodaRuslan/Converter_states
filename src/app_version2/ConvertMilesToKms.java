package app_version2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertMilesToKms implements Convert {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("0.#####");



    // This method converts miles to kilometers!
    @Override
    public void convertLength() {
        System.out.println("Enter length ");
        double input = scanner.nextDouble();
        double resultMiles = input * 1.60934;
        String inputFormatMiles = decimalFormat.format(resultMiles);
        String inputFormatKms = decimalFormat.format(input);
        System.out.printf("Result: %s miles in kms = %s", inputFormatKms, inputFormatMiles);
    }
}
