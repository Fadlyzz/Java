
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class utsbang {

    public static void main(String[] args) {
        Scanner mlebu = new Scanner (System.in); 
        //Variabel
        int nilai;
        //Input + Output
        System.out.print("Nama Mahasiswa         = ");
        mlebu.nextLine();
        System.out.print("NIM                    = ");
        mlebu.nextInt();
        System.out.print("Masukkan Nilai (1-100) = ");
        nilai = mlebu.nextInt();
        //Sistem Penilaian
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Grade                  = " +'A');
            System.out.println("Keterangan             = Sangat Baik");
        }
        else if (nilai >= 70 && nilai < 80) {
            System.out.println("Grade                  = " +'B');
            System.out.println("Keterangan             = Baik");
        }
        else if (nilai >= 60 && nilai < 70) {
            System.out.println("Grade                  = " +'C');
            System.out.println("Keterangan             = Cukup");
        }
        else if (nilai >= 50 && nilai < 60) {
            System.out.println("Grade                  = " +'D');
            System.out.println("Keterangan             = Kurang");
        }
        else if (nilai < 50 && nilai >= 1){
            System.out.println("Grade                  = " +'E');
            System.out.println("Keterangan             = Tidak Lulus");
        }
        else {
            System.out.println("Masukkan Nilai Yang Benerlah!");
        }
        }
    }