package javaapplication2.Inheritance.Overriding;

public class Persegi extends BangunDatar{
       float sisi;
    
    public void luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi = " + luas);
    }
    
    public void keliling(){
        float keliling = 4 * sisi;
        System.out.println("keliling Persegi = " + keliling);
    }
}