package javaapplication2.Inheritance.Overriding;

public class Hasil {
        public static void main(String[] args) {
        BangunDatar bangundatar = new BangunDatar();
        
        Persegi Persegi = new Persegi();
        Persegi.sisi = 8;
        
        PersegiPanjang perjang = new PersegiPanjang();
        perjang.lebar = 11;
        perjang.panjang = 2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }
}
