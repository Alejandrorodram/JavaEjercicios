package Alejandrorodram.JavaEjercicios.Udemy.ControlFlowMethods;

public class SumFirstAndLastDigit {
    //Method to find first and last digit passed to the method.
    //Return the sum of the first and last digit of that number.
    public static int sumFirstAndLastDigit(int number){
        //int reverse;
        int firstDigit = 0;
        int lastDigit = number % 10;
        int LoopCheckNumber = number;
        int reverseNumber = 0;
        int sumNumber = 0;

        while (LoopCheckNumber > 0){
            int digitAdd = LoopCheckNumber % 10;
            reverseNumber = (reverseNumber * 10) + digitAdd;
            LoopCheckNumber = LoopCheckNumber / 10;
        }

        firstDigit = reverseNumber % 10;

        sumNumber = firstDigit + lastDigit;
        if (sumNumber < 0){
            return -1;
        } else {
            return sumNumber;
        }
    }
}
