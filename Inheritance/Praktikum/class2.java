package javaapplication2.Inheritance.Praktikum;

public class class2 extends class1{
    String nama;
    int NP;
    int gaji, gajibonus;
    int jamkerja, jabatan;
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public void setNP(int NP){
        this.NP = NP;
    }
    
    public void gaji(){
        gaji = jamkerja * jabatan;
        System.out.println("Gaji utama yang didapatkan : " + gaji);
    }
    
    public void gajibonus(){
        gajibonus = 2 * 1200000;
        System.out.println("Gaji yang didapat jika bekerja dengan baik menjadi " + gajibonus);
    }
    
    public void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + super.jenkel);
        System.out.println("Nomor Pegawai : " + NP);
    }
}
