package javaapplication2.Inheritance.Praktikum;

public class class3 {
    public static void main(String[] args) {
        class1 class1 = new class1();
        class1.identitas("Berikut identitas ", "pegawai ");
        class1.identitas("admin");
        
        class2 class2 = new class2();
        class2.setnama("Diah");
        class2.setNP(333333);
        class2.jamkerja = 120;
        class2.jabatan = 10000;
        
        class2.cetak();
        class2.gaji();
        class2.gajibonus();
    }
}
