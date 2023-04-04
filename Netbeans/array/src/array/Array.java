/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Lenovo
 */
import javax.swing.*;
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa" ));
        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] hasil = new String[jumlah];
        
        for (int i=0; i<jumlah; i++){
        nama[i] = JOptionPane.showInputDialog("Nama Mahasiswa ke-" + (i+1) + ":");
        nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("Nilai Mahasiswa ke-" +(i+1)+":"));
            if (nilai[i] >= 70 && nilai[i] <=100) {
                hasil[i] = "LULUS";
            }else if (nilai[i] >=0 && nilai[i] <70) {
                hasil[i] = "TIDAK LULUS";
            }else {
                hasil[i] = "NILAI YANG ANDA MASUKKAN SALAH!";
            }         
        }
      String header = "=================================\n                     HASIL KELULUSAN\n=================================";
      String footer = "===============##================";
      for (int i=0; i<jumlah; i++){
          header +="\nNama      = "+nama[i]+ "\nNilai         = "+nilai[i]+ "\nHasil        = "+hasil[i]+ "\n" +footer;
      }
      JOptionPane.showMessageDialog(null,header);
    }
    
}
