/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author SMK TELKOM 31
 */
public class Lingkaran extends BangunDatar {
    
    double r;
    
    @Override
    double luas(){
        
        double LuasLingkaran = Math.PI * r * r;
        System.out.println("Hasil dari luas lingkaran adalah = "+ LuasLingkaran);
        
        return LuasLingkaran;
    }
    
    double keliling(){
    
        double KelilingLingkaran = Math.PI * 2 * r;
        System.out.println("Hasil dari keliling lingkaran adalah = " + KelilingLingkaran);
        
        return KelilingLingkaran;
    }
}
