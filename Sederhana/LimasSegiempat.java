// Nama     : Bagus Fadly Hidayatullah
// NIM      : 2022010027
// Kelas    : RPL I A 2022

import java.util.Scanner;

public class LimasSegiempat {
           
public static void main(String[] args){ 
    Scanner userInput = new Scanner(System.in); 
    double panjang, lebar, tinggi, sisi, LAlas, luas, volume;
           
    Scanner input = new Scanner(System.in);
      System.out.println("Masukan Tinggi Limas Segiempat :");
      tinggi = userInput.nextDouble();
      System.out.println("Masukan Lebar Limas Segiempat :");
      lebar = userInput.nextDouble();
      System.out.println("Masukan Sisi Segitiga Limas Segiempat :");
      sisi = userInput.nextDouble();
      System.out.println("Masukan Panjang Limas Segiempat   :");
      panjang = userInput.nextDouble();
     
      LAlas = (sisi*sisi);
      volume = (1*panjang*lebar*tinggi/3);
      System.out.println("Hasil dari volume limas Segiempat = " +volume);
      luas = (sisi*sisi*sisi*sisi*LAlas);
      System.out.println("Hasil dari luas limas Segiempat = " +luas);
           
        }
}
