//Nama  : Bagus Fadly Hidayatullah
//NIM   : 2022010027
//Kelas : RPL I A

import java.util.Scanner;

public class Tugas05 {
    //Rumus
    static double pitagoras (double a, double b){
        double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2));
        return c;
    }
    public static void main(String[] args) {
        double a;
        double b;
    
    //Input Nilai A dan B
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input Nilai A = ");
    a = keyboard.nextDouble ();
    System.out.print("Input Nilai B = ");
    b = keyboard.nextDouble ();

    //Memanggil Rumus Pitagoras
        double c = pitagoras (a,b);

    //Output
        System.out.printf("Hasil Nilai C = "+"%.2f %n",c);
        
    }
    
}