package Alejandrorodram.JavaEjercicios.Udemy.SimpleMethods;

public class IsLeapYear {
    public static boolean LeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
}
