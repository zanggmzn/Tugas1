/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class Main {
    static double Celcius;
    public static void main(String[] args) {
        //instansiasi panggil kelas Konversi
        Konversi suhu = new Konversi();
        Konversi status = new Konversi();
        double Fahrenheit,Kelvin,Reamur;
        int Option;
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("         Input Data          ");
        System.out.println("+---------------------------+");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Suhu Dalam Celcius : ");
        Celcius = input.nextDouble();
        
        do{
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            Scanner pilih = new Scanner(System.in);
            System.out.print("Pilih Opsi: ");
            Option = pilih.nextInt();
            switch(Option){
                case 1:
                    Reamur = suhu.hitungReamur();
                    Fahrenheit = suhu.hitungFahrenheit();
                    Kelvin = suhu.hitungKelvin();
                    System.out.println("\nHasil Konversi:");
                    System.out.println("Suhu dalam Celcius     : " + Celcius + "°C");
                    System.out.println("Suhu dalam Fahrenheit  : " + Fahrenheit+ "°F");
                    System.out.println("Suhu dalam Reamur      : " + Reamur+ "°R");
                    System.out.println("Suhu dalam Kelvin      : " + Kelvin+ "°K");
                    status.hitungTitik();
                    break;
                case 2:
                    System.out.println("\n+---------------------------+");
                    System.out.println("         Input Data          ");
                    System.out.println("+---------------------------+");
                    System.out.print("Suhu Dalam Celcius : ");
                    Celcius = input.nextDouble();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }while(true);
    }
    
}
