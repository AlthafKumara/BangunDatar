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
public class PersegiPanjang extends BangunDatar {
    
    double l;
    double p;
    
    @Override
    double luas(){
        double LuasPersegiP = p * l;
        System.out.println("Hasil dari luas persegi panjang adalah = " + LuasPersegiP);
        
        return LuasPersegiP;
    }
    
    double keliling(){              
        double KelilingPersegiP = p + l + p + l;
        System.out.println("Hasil dari keliling persegi panjang adalah = " + KelilingPersegiP);
        
        return KelilingPersegiP;
    }
}
