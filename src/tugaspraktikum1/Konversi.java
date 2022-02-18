/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

import static tugaspraktikum1.Main.Celcius;

/**
 *
 * @author asus
 */
public class Konversi {
    double hitungReamur(){
        return ((4*Main.Celcius)/5);
    }
    double hitungFahrenheit(){
        return ((9*Main.Celcius)/5+32);
    }
    double hitungKelvin(){
        return (Main.Celcius+273.15);
    }
    void hitungTitik(){
        if(Celcius <1){
            System.out.println("Kondisi Air Beku");
        }else if(Celcius >0 && Celcius <100){
            System.out.println("Kondisi Air Normal");
        }else if(Celcius >=100){
            System.out.println("Air Mendidih");
        }
    }
}
