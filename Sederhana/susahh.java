//Nama  : Bagus Fadly Hidayatullah
//Nim   : 2022010027
//Kelas : RPL A

import java.util.Scanner;
public class susahh {
public static void main(String[] args) {  
    Scanner mlebu = new Scanner(System.in);
    //Input
    System.out.println("==============================================");
    System.out.println("                 =>> Input <<=");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("        Maksimal Konversi Hanya 100 kali");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.printf(" Desimal Awal     = ");
    int awal = mlebu.nextInt();
    System.out.printf(" Desimal Akhir    = ");
    int akhir = mlebu.nextInt();
    //Output
    System.out.println("==============================================");
    System.out.println("               || =>> Output <<= ||");
    System.out.println("               ====================");
    System.out.println();
    //Output + Konversi
    System.out.printf("|%-10s|%-10s|%-10s|%-10s\n"," Desimal","   Biner","   Oktal","   Heksadesimal");
    for(int i=awal;i<=akhir;i++){
    String biner = Integer.toBinaryString(i);
    String oktal = Integer.toOctalString(i);
    String heksa = Integer.toHexString(i);
    System.out.printf("|%-10s|%-10s|%-10s|%-10s\n",i,biner,oktal,heksa);
    //Jika lebih dari 100 maka akan berhenti
    if(i>=100){
    System.out.println("==============================================");
    System.out.println("        Batas Konversi hanya 100 kali!!");
    System.out.println("==============================================");
    break;
        }
      }
    }
}
