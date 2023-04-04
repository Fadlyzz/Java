// Nama     : Bagus Fadly Hidayatullah
// NIM      : 2022010027
// Kelas    : RPL I A 2022

import java.util.Scanner;

public class Kerucut {
   
public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double phi = 3.14;
        double r, tinggi, s;
        double Luas, volume;
        double sisi = 2;
        double tsudut = 1;
        double rusuk = 1;
 
        System.out.println("Hitung Luas Permukaan dan Volume Kerucut");
        System.out.print(" Masukkan Jari-jari   : ");
        r = userInput.nextDouble();
        System.out.print(" Masukkan Tinggi  : ");
        tinggi = userInput.nextDouble();
        System.out.print(" Masukkan Panjang Sisi Miring   :");
        s = userInput.nextDouble();

        Luas = (phi*(Math.pow (r,2))+ (phi*r*s));
        System.out.println("Luas Permukaannya   :" + Luas);
        volume = (1*phi*(Math.pow(r,2))*tinggi/3);
        System.out.println("Volume Kerucutnya   :" + volume);
    }
}