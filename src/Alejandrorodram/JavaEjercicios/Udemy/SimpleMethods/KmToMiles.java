package Alejandrorodram.JavaEjercicios.Udemy.SimpleMethods;

public class KmToMiles {

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
    public static void main(String[] args) {
        //example 50km to miles
        printConversion(50);
    }

}
