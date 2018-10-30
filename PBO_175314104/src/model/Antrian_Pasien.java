package model;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Antrian_Pasien {
 private int tanggalantrian,bulanantrian, tahunantrian; //variabel integer bersifat private
 private Klinik klinik; //variabel Klinik bersifat private
 private Pasien daftarPasien[]; //array bertipe data Pasien bersifat private

    public void setKlinik(Klinik klinik) { //method void setKlinik dengan parameter klinik
        this.klinik = klinik;
    }
    
     public Klinik getKlinik() {//method getKlinik yang mereturn variabel bertipe data klinik
        return klinik;
    }
     
    public void setDaftarPasien(Pasien[] daftarPasien) { //method void setDaftarPasien parameter array daftarPasien bertipe data Pasien
        this.daftarPasien = daftarPasien;
    }

    public Pasien[] getDaftarPasien() { //method getDaftarPasien yang mereturn array data Pasien
        return daftarPasien;
    }

   
 
}
