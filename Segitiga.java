/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;


public class Segitiga extends BangunDatar {
    
    double a,t,sm;
    
    double luas(){
        double LuasSegitiga = a * t / 2;
        System.out.println("Hasil dari luas persegi adalah = " + LuasSegitiga);
        
        return LuasSegitiga;

    }
    
    double keliling(){
        double KelilingSegitiga = sm + sm + a;
        System.out.println("Hasil dari keliiling segitiga adalah = " + KelilingSegitiga);
        
        return KelilingSegitiga;
        
    }
    
}
