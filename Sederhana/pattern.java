//Nama      : Bagus Fadly Hidayatullah
//NIM       : 2022010027
//Kelas     : RPL A 2022

public class pattern {
    public static void main(String[]args){
        //Bentuk 1
        System.out.println("Pattern A");
        System.out.println("");
        for (int a=1 ; a<=6 ; a++){
            for (int b=2; b<= a; b++){
                System.out.print(" *");
            } System.out.println(" *");
        }
        //Bentuk 2
        System.out.println("");
        System.out.println("Pattern B");
        System.out.println("");
        for (int c=6; c>=1 ; c--) {
            for(int d=2; d<=c; d++) {
                System.out.print(" *");
            } System.out.println(" *");
        }
        //Bentuk 3
        System.out.println("");
        System.out.println("Pattern C");
        System.out.println("");
        for (int e = 1; e <= 6; e++){
            for (int f = 6; f >= e; f--) {
                System.out.print("  ");
            }
            for (int z = 1; z <= e; z++){
                System.out.print(" ");
                System.out.print('*');
            }
            System.out.println();
        }
        //Bentuk 4
        System.out.println("");
        System.out.println("Pattern D");
        System.out.println("");
        for (int g = 0; g <= 5; g++){
            for (int h = 0; h <= 5; h++){
                if((h<=5)&&(g-h)>=1){
                System.out.printf("  ");
                continue;
            }
            System.out.printf("* ");
        }
        System.out.println();
        }
    }
}