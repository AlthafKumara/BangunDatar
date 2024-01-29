
package bangundatar;

public class Persegi extends BangunDatar {

double s;

@Override
double luas(){    
    double LuasPersegi = s * s;
    System.out.println("Hasil dari Luas Persegi adalah = " + LuasPersegi);
    
    return LuasPersegi;
    
}

double keliling(){    
    double KelilingPersegi = s + s + s + s;
    System.out.println("Hasil dari keliling persegi adalah = " + KelilingPersegi);
    
    return KelilingPersegi; 
}

}
