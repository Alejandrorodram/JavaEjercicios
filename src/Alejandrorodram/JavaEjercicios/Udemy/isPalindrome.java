package Alejandrorodram.JavaEjercicios.Udemy;

public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome(101);
    }
    public static boolean isPalindrome(int number)
    {
        if (number < 0)
        {
            number *= -1;
            //hacemos el número positivo, ya que con negativos no va a salir bien
        }

        int reverse = 0; //número usado para comparar con el original
        int stored = number; //número usado para que mientras sea mayor que 0 continuar el proceso

        int i=0;
        while (stored > 0)
        {
            i++;
            System.out.println(i+"º vuelta:");

            // extract the lest-significant digit
            int digit = stored % 10;
            System.out.println("digit = " + digit);
            reverse = (reverse * 10) + digit;
            System.out.println("reverse = " + reverse);
            // drop the least-significant digit
            stored /= 10;
            System.out.println("stored = " + stored);

            System.out.println("");
        }

        System.out.println(reverse);
        if (number == reverse)
        {
            return true;
        } else
        {
            return false;
        }

    }
}
