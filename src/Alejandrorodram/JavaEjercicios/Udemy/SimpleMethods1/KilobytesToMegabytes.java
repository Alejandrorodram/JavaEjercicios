package Alejandrorodram.JavaEjercicios.Udemy.SimpleMethods1;

public class KilobytesToMegabytes {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = Math.round(kiloBytes/1024);
            int remainingKiloBytes = kiloBytes - (megaBytes*1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
    public static void main(String[] args) {
        //example 50 kilobytes to megabytes + remainer kilobytes
        printMegaBytesAndKiloBytes(2000);
    }
}
