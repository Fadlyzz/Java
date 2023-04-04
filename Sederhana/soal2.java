// Nama     : Bagus Fadly Hidayatullah
// Nim      : 2022010027
// Kelas    : RPL I A

import java.util.Scanner;

public class soal2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("=>> Program Menentukan Nilai Terkecil <<=");
        System.out.println("=========================================");


        //Variabel
        int[] arr = new int[100];
        int arr_count = 4, i, min_number;

        System.out.println("            Jumlah Angka = "+arr_count);

        System.out.println("   Input "+arr_count+ " Angka Dipisah dengan Enter = " );
        System.out.println("-----------------------------------------");
        for(i = 0; i < arr_count; i++){
            arr[i] = input.nextInt( );
        }
        min_number = arr[0];
        for(i = 0; i < arr_count; i++){
            if(arr[i] < min_number) {
                min_number = arr[i];
            }
        }
        System.out.println("=========================================");
        System.out.println("        Angka Terkecil adalah = " + min_number);
        System.out.println("=========================================");

    }
}