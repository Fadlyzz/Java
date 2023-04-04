//Nama      : Bagus Fadly Hidayatullah
//NIM       : 2022010027
//Kelas     : RPL A 2022

import java.util.Scanner;
public class konpersii {
     public static void main(String[] args) {
      System.out.print("=========================== ");
      System.out.print("Konversi Suhu");
      System.out.println(" ===========================");
        Scanner masuk = new Scanner(System.in);
        //Input
        System.out.printf("Nilai Awal : ");
        double awal = masuk.nextDouble();
        System.out.printf("Nilai Akhir : ");
        double akhir = masuk.nextDouble();
        System.out.println("=====================================================================");
        System.out.println("");
        //Output
        System.out.printf("|%-10s|%-10s|%-2s|%-10s|%-10s\n","Celcius","Fahrenheit","*","Fahrenheit","Celcius");
        for (double i=awal;i<=akhir;i++){
           double F = (9*i)/5+32;
           double C = (5*(i-32))/9;
        System.out.printf("|%-10s|%-10s|%-2s|%-10s|%-10s\n",i,String.format("%.3f",F),"*",i,String.format("%.3f",C));    
    }
}
}