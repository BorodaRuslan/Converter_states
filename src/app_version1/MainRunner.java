package app_version1;

public class MainRunner {
    public static void main(String[] args) {

        System.out.println("Application development start 'Version 1' 11.06.2023");

        double resultMiles = convertKmsToMiles(10);
        System.out.println("Miles = " + resultMiles);

        double resultKm = convertMilesToKms(10);
        System.out.println("Kilometers = " + resultKm);

    }

    //This method converts miles to kilometers
    public static double convertMilesToKms(double miles){
        return miles * 1.60934;
    }

    // This method converts kilometers to miles
    public static double convertKmsToMiles(double km) {
        return km / 1.60934;
    }
}
