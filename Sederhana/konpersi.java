//Nama      : Bagus Fadly Hidayatullah
//Nim       : 2022010027
//Kelas     : RPL A

import java.util.Scanner;

public class konpersi {
    public static void main(String[] args){
Scanner mlebu = new Scanner(System.in);
float c, r, f, k;

System.out.print("=========================== ");
System.out.print("Konversi Suhu");
System.out.println(" ===========================");
System.out.println("1. Dari Celcius");
System.out.println("2. Dari Reamur");
System.out.println("3. Dari Fahrenheit");
System.out.println("4. Dari Kelvin");
System.out.print("Pilih = ");
int x = mlebu.nextInt();
switch (x){
case 1:
System.out.print("Celcius = ");
c = mlebu.nextFloat();

float reamur = (float) (0.8*c);
float fahrenheit = (float) (1.8*c+32);
float kelvin = (float) (c+273);

System.out.println("Reamur     = " +reamur);
System.out.println("Fahrenheit = " +fahrenheit);
System.out.println("Kelvin     = " +kelvin);
break;

case 2:
System.out.print("Reamur = ");
r = mlebu.nextFloat();

float celcius = (float) (1.25*r);
float fahrenheit2 = (float) (2.25*r+32);
float kelvin2 = (float) (1.25*r+273);

System.out.println("Celcius     = "+celcius);
System.out.println("Fahrenheit  = "+fahrenheit2);
System.out.println("Kelviin     = "+kelvin2);
break;

case 3:
System.out.print("Fahrenheit = ");
f = mlebu.nextFloat();

float celcius2 = (float) (0.5555555555555*f-32);
float reamur2 = (float) (0.4444444444444*f-32);
float kelvin3 = (float) ((f-32/1.8)+273);

System.out.println("Celcius = "+celcius2);
System.out.println("Reamur  = "+reamur2);
System.out.println("Kelvin  = "+kelvin3);
break;

case 4:
System.out.print("Kelvin = ");
k = mlebu.nextFloat();

float celcius3 = (float) (k-273);
float reamur3 = (float) (0.8*k-32);
float fahrenheit3 = (float) ((k-273.15)*1.8+32);

System.out.println("Celsius     = "+celcius3);
System.out.println("Reamur      = "+reamur3);
System.out.println("Fahrenheit  = "+fahrenheit3);
break;

default:
System.out.println("Invalid Number!");
        }
    }
}