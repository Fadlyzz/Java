import java.util.Scanner;

public class nomer1 {
    public static void main(String args[])
    {
        int a, b, c, d;
//Input
    Scanner input = new Scanner(System.in);
    System.out.println("=========================================");
    System.out.println("     => Program Membalikkan Nilai <=");
    System.out.println("=========================================");
    System.out.println("                  -##-                   ");
    System.out.print("Nilai A = ");
    a = input.nextInt();
    System.out.print("Nilai B = ");
    b = input.nextInt();
    System.out.print("Nilai C = ");
    c = input.nextInt();

//Rumus
    d = a ;
    a = c ;
    c = b ;
    b = d ;

//Output
    System.out.println("            Setelah dibalik = ");
    System.out.println("Nilai A = " +a);
    System.out.println("Nilai B = " +b);
    System.out.println("Nilai C = " +c);

    }
}

