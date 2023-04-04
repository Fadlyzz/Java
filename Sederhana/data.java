//Nama   : Bagus Fadly Hidayatullah
//NIM    : 2022010027
//Kelas  : RPL A

import java.util.Scanner;

public class data {
    public static void main(String[] args) {

        Scanner mlebu = new Scanner (System.in);
        //Variabel
        double mtk, indo, ing, komp, olahraga, jawi;
    
        //Input User
        System.out.println(" ");
        System.out.println("#######################################################");
        System.out.println("Program Mengetahui Lulus atau Tidak Lulus (True/False)");
        System.out.println("#######################################################");
        System.out.printf("Nilai Bahasa Indonesia = ");
        indo = mlebu.nextDouble();
        System.out.printf("Nilai Matematika = ");
        mtk = mlebu.nextDouble();
        System.out.printf("Nilai Bahasa Inggris = ");
        ing = mlebu.nextDouble();
        System.out.println("########################################################");
        System.out.println(" ");
        System.out.println("########################################################");
        System.out.printf("Nilai Komputer = ");
        komp = mlebu.nextDouble();
        System.out.printf("Nilai Olahraga = ");
        olahraga = mlebu.nextDouble();
        System.out.printf("Nilai Bahasa Jawa = ");
        jawi = mlebu.nextDouble();
        System.out.println("########################################################");
        System.out.println(" ");

         boolean test1 = (indo >= 70 || mtk >= 60 || ing >= 65);
	      boolean test2 = (((indo + mtk + ing)/3) > 65);
	      boolean test3 = (komp >= 70 | olahraga >= 70 | jawi >= 70);
	      boolean test4 = (((komp + olahraga + jawi)/3) > 70);
	      boolean test5 = (test1 && test2 && test3 && test4);
		   System.out.println("=======================================================");
		   System.out.println("Hasil Kelulusan anda adalah = " + test5);
		   System.out.println("=======================================================");

        }
    }