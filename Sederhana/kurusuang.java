//Nama  : Bagus Fadly Hidayatullah
//NIM   : 2022010027
//Kelas : RPL I A

import java.util.Scanner;

public class kurusuang {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double dollar, dollar2;
        int kurs, rupiah;
        String pager = "##############################";
        String samadengan = "==============================";
        String strip = "------------------------------";
        String spasi = " ";
        Float rupiahh;

        System.out.println(pager);
        System.out.print("Kurs Dollar Sekarang = Rp ");
        kurs = userInput.nextInt();
        System.out.print("Nilai Rupiah = Rp ");
        rupiah = userInput.nextInt();
        System.out.printf("Nilai Dollar = ");
        dollar2 = userInput.nextDouble();

        dollar = rupiah/kurs;
    
        System.out.println(pager);
        System.out.println(samadengan);
        System.out.println("Konversi Rupiah ke Dollar");
        System.out.println(samadengan);
        System.out.println("Nilai Rupiah = Rp " +rupiah);
        
        System.out.println(spasi);
        System.out.printf("--> Rp "+rupiah+ " = $ " + "%.2f %n",dollar);
        System.out.println(strip);
        System.out.println(spasi);

        System.out.println(samadengan);
        System.out.println("Konversi Dollar ke Rupiah");
        System.out.println(samadengan);
        System.out.println("Nilai Dollar = " +dollar2);

        System.out.println(spasi);
        System.out.printf("--> $ "+ "%.2f %n",dollar2);
        System.out.println(strip);


    }
}