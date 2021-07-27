package Alejandrorodram.JavaEjercicios.Udemy.ControlFlowMethods2;

public class HasSameLastDigit {
    //pass 3 numbers to the method, they must be inside 10-1000 (both inclusive).
    //return true if at least 2 of the 3 numbers share the same rightmost digit.
    public static boolean hasSameLastDigit (int number1, int number2, int number3){
        int digit1 = number1%10;
        int digit2 = number2%10;
        int digit3 = number3%10;
        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000){
            return false;
        } else if (digit1 == digit2 || digit1 == digit3 || digit2 == digit3){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number4) {
        if (number4 > 1000 || number4 < 10){
            return false;
        } else {
            return true;
        }
    }
}
