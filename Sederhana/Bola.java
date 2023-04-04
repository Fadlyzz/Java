// Nama     : Bagus Fadly Hidayatullah
// NIM      : 2022010027
// Kelas    : RPL I A 2022

import java.util.Scanner;

public class Bola {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double phi = 3.14;
      
        System.out.println("Menghitung Luas Bola dan Volume Bola");
        System.out.print("Masukkan Nilai Jari-jari (r) : ");
        r = input.nextDouble();
        System.out.println("Luas Bola : " + 4*phi*(Math.pow(r,2)));
        System.out.println("Volume Bola : " + 4*phi*Math.pow(r,3)/3);
    }
}
	