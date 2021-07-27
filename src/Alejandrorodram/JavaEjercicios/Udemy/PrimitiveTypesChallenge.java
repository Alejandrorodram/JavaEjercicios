package Alejandrorodram.JavaEjercicios.Udemy;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte mybytenumber = 50;
        //System.out.println(mybytenumber);
        short myshortnumber = 10000;
        int myintnumber = 123123;
        long mylongnumber = 50000+10*(mybytenumber+myshortnumber);
        System.out.println(mylongnumber);

        short shortTotal = (short) (1000 + 10 * (mybytenumber+ myshortnumber + myintnumber));
        System.out.println(shortTotal);

        


    }

}
