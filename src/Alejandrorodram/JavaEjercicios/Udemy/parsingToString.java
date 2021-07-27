package Alejandrorodram.JavaEjercicios.Udemy;
public class parsingToString {
    public static void main(String[] args) {
        String numberAsString = "2018"; //if we add a latter it gives error because we can't use parseInt
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        double number2 = Double.parseDouble(numberAsString);
        System.out.println("number2 = " + number2);


    }
}
