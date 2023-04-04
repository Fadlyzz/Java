/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fadly
 */
import java.util.Scanner;
public class bagibagi {
    public static void main(String[] args) {
        int angka;
    Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukkan Nilai Batas = ");
        angka = mlebu.nextInt();
    if (angka%2==0 && angka%3==0) {
        System.out.println(+angka+" Habis Dibagi 2 dan 3");
    }
    else if (angka%2==0 || angka%3==0){
        System.out.println(+angka+" Habis Dibagi 2 atau 3");
    }
    else{
        System.out.println(+angka+" Tidak Habis Dibagi 2 ataupun 3");
    }
        }
    }