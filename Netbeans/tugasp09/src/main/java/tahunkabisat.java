
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;
public class tahunkabisat {
  public static void main(String[] args) {
    int tahun;

    Scanner mlebu = new Scanner(System.in);
    System.out.print("Masukkan Tahun = ");
    tahun = mlebu.nextInt();

    if (tahun % 400 == 0) {
      System.out.print("==> Tahun " +tahun+ " Merupakan Tahun Kabisat");
    } else if (tahun % 100 == 0) {
      System.out.print("==> Tahun " +tahun+ " Bukan Tahun Kabisat");
    } else if (tahun % 4 == 0) {
      System.out.print("==> Tahun " +tahun+ " Merupakan Tahun Kabisat");
    } else {
      System.out.print("==> Tahun "+tahun+ " Bukan Tahun Kabisat");
    }
  }
}
