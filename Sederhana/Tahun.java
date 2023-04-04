// Nama     : Bagus Fadly Hidayatullah
// NIM      : 2022010027
// Kelas    : RPL I A

import java.util.Scanner;

public class Tahun {

    public static void main(String[] args) {
        //Variabel
        int hari, minggu, bulan, tahun;
        String Char = "===========================";

        //Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Jumlah Hari    : ");
        hari = keyboard.nextInt ();
        
        //Perhitungan hari-minggu-bulan-tahun
        tahun = (hari/365);
        minggu = (hari%365)%30/7;
        bulan = (hari%365)/30;

        //Output
        System.out.println("\n"+hari+ " Jumlah hari adalah ");
        System.out.println(Char);
        System.out.println("\n"+minggu+" Minggu "+bulan+" Bulan "+tahun+" Tahun");
        System.out.println(Char);

    }
}
