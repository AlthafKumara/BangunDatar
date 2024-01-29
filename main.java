package bangundatar;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner (System.in);
        
        System.out.println("Rumus Bangun Datar");
        
        System.out.print("Masukkan Rumus Yang Ingin dicari Luas/Keliling = ");
        String rumus = myObj.nextLine();
        
        switch(rumus){
        
            case "Keliling":
                
                System.out.print("Masukkan Rumus keliling yang ingin di cari = ");
                String rumusKeliling = myObj.nextLine();
                
               switch(rumusKeliling){
                   
                   case "Persegi":
                       
                       Persegi persegi = new Persegi();
                       System.out.println("Rumus keliling dari persegi adalah = s + s + s + s");
                       
                       System.out.print("Masukkan nilai s = ");
                       double S = myObj.nextDouble();
                       
                       persegi.s = S;
                       persegi.keliling();
                       
                       break;
                       
                   case "Persegi Panjang":
                       
                       PersegiPanjang persegipanjang = new PersegiPanjang();
                       System.out.println("Rumus keliling dari persegi panjang adalah = p+l+p+l");
                       
                       System.out.print("Masukkan nilai p = ");
                       double P = myObj.nextDouble();
                       
                       System.out.print("Masukkan nilai l = ");
                       double L = myObj.nextDouble();
                       
                       persegipanjang.p = P;
                       persegipanjang.l = L;
                       persegipanjang.keliling();
                       
                       break;
                       
                   case "Segitiga":
                       
                       Segitiga segitiga = new Segitiga();
                       System.out.println("Rumus dari keliling segitiga adalah = sm + sm + a");
                       
                       System.out.print("Masukkan nilai sisi miring = ");
                       double SM = myObj.nextDouble();
                       
                       System.out.print("Masukkan nilai alas = ");
                       double A = myObj.nextDouble();
                       
                       segitiga.sm = SM;
                       segitiga.a = A;
                       segitiga.keliling();
                       
                       break;
                       
                   case "Lingkaran":
                       
                       Lingkaran lingkaran = new Lingkaran();
                       System.out.println("Rumus dari keliling lingkaran adalah = phi * r * r");
                       
                       System.out.println("Masukkan nilai r");
                       double R = myObj.nextDouble();
                       
                       lingkaran.r = R;
                       lingkaran.keliling();
                       
               } 
        }
        
        
        
    }
    
}
