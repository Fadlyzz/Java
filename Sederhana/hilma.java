import java.util.Scanner;
public class hilma {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai = ");
        int angka = input.nextInt();

        if (angka > 0){
            System.out.println(angka+ " Bilangan Positif");
        } else if (angka < 0) {
            System.out.println(angka+ " Bilangan Negatif");
        } else {
            System.out.println("Bilangan Nol");
        }
    }
}
